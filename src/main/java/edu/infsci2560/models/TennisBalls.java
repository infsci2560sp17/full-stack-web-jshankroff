package edu.infsci2560.models;


    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *
 * @author jshankroff
 */
@Entity
public class TennisBalls {

    private static final long serialVersionUID = 1L;

    public enum BallType {
        Unknown,
        Wilson,
        Gamma,
        Slazenger,
        Dunlop,
        Penn,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected BallType ballType;

    public TennisBalls() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.ballType = BallType.Unknown;
    }

    public TennisBalls(Long id, String name, BallType ballType) {
        this.id = id;
        this.title = name;
        this.ballType = ballType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", ballType=" + this.ballType + " ]";
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * @return the name
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the name to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the ballType
     */
    public BallType getBallType() {
        return ballType;
    }

    /**
     * @param ballType the ballType to set
     */
    public void setBallType(BallType ballType) {
        this.ballType = ballType;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

}
