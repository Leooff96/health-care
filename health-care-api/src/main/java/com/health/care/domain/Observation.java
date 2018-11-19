package com.health.care.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

/**
 * Observations
 */
@Data
@JacksonXmlRootElement(localName="Observation")
@Document
public class Observation {

    @Id private String _id;

    @Field("DATE")
    private String Date;
    @Field("PATIENT")
    private String Patient;
    @Field("ENCOUNTER")
    private String Encounter;
    @Field("CODE")
    private String Code;
    @Field("DESCRIPTION")
    private String Description;
    @Field("VALUE")
    private Double Value;
    @Field("UNITS")
    private String Units;

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        Code = code;
    }
    /**
     * @return the code
     */
    public String getCode() {
        return Code;
    }
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        Date = date;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return Date;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        Description = description;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return Description;
    }
    /**
     * @param encounter the encounter to set
     */
    public void setEncounter(String encounter) {
        Encounter = encounter;
    }
    /**
     * @return the encounter
     */
    public String getEncounter() {
        return Encounter;
    }
    /**
     * @param patient the patient to set
     */
    public void setPatient(String patient) {
        Patient = patient;
    }
    /**
     * @return the patient
     */
    public String getPatient() {
        return Patient;
    }
    /**
     * @param units the units to set
     */
    public void setUnits(String units) {
        Units = units;
    }
    /**
     * @return the units
     */
    public String getUnits() {
        return Units;
    }
    /**
     * @param value the value to set
     */
    public void setValue(Double value) {
        Value = value;
    }
    /**
     * @return the value
     */
    public Double getValue() {
        return Value;
    }
}