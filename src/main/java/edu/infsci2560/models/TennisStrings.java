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
public class TennisStrings {

    private static final long serialVersionUID = 1L;

    public enum StringType {
        Unknown,
        Kirschbaum,
        Babolat,
        Head,
        Yonex,
        Prince,
        Technifibre,
        Ashaway,
        Luxilon,
        Solinco,
        Dunlop,
        Gamma,
        Forten,
        Gosen,
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
    protected String title;
    protected StringType stringType;

    public TennisStrings() {
        this.id = Long.MAX_VALUE;
        this.title = null;
        this.stringType = stringType.Unknown;
    }

    public TennisStrings(Long id, String name, StringType stringType) {
        this.id = id;
        this.title = name;
        this.stringType = stringType;
    }

    @Override
    public String toString() {
        return "[ id=" + this.id + ", title=" + this.title + ", stringType=" + this.stringType + " ]";
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
     * @return the stringType
     */
    public StringType getStringType() {
        return stringType;
    }

    /**
     * @param workoutType the workoutType to set
     */
    public void setRacketType(StringType stringType) {
        this.stringType = stringType;
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

