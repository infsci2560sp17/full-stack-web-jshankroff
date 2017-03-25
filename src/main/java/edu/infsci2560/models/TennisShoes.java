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
public class TennisShoes {

    private static final long serialVersionUID = 1L;

    public enum RacketType {
        Unknown,
        Nike,
        Adidas,
        NewBalance,
        Wilson,
        Babolat,
        Head,
        Prince,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected ShoeType shoeType;

    public TennisShoes() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.shoeType = ShoeType.Unknown;
    }

    public TennisShoes(Long id, String name,ShoeType shoeType) {
        this.id = id;
        this.title = name;
        this.shoeType = shoeType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", shoeType=" + this.shoeType + " ]";
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
     * @return the shoeType
     */
    public ShoeType getShoeType() {
        return shoeType;
    }

    /**
     * @param shoeType the shoeType to set
     */
    public void setShoeType(ShoeType shoeType) {
        this.shoeType = shoeType;
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
