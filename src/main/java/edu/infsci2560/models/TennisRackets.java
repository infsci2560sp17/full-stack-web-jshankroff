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
 * @author kolobj
 */
@Entity
public class TennisRackets {

    private static final long serialVersionUID = 1L;

    public enum RacketType {
        Unknown,
        Wilson,
        Babolat,
        Head,
        Yonex,
        Prince,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected RacketType racketType;

    public TennisRackets() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.racketType = RacketType.Unknown;
    }

    public TennisRackets(Long id, String name, RacketType racketType) {
        this.id = id;
        this.title = name;
        this.racketType = racketType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", racketType=" + this.racketType + " ]";
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
     * @return the workoutType
     */
    public RacketType getRacketType() {
        return racketType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setRacketType(RacketType racketType) {
        this.racketType = racketType;
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
