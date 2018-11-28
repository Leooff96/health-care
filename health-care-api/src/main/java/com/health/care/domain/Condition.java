package com.health.care.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Data;

/**
 * Condition
 */

@JacksonXmlRootElement
@Data
@Document
public class Condition {

    @Id private String _id;

    @Field("START")
    private String start;
    @Field("STOP") 
    private String stop; 
    @Field("PATIENT")
    private String patient;
    @Field("ENCOUNTER") 
    private String encounter;
    @Field("CODE")
    private Long code;
    @Field("DESCRIPTION") 
    private String description;

    /**
     * @param code the code to set
     */
    public void setCode(Long code) {
        this.code = code;
    }
    /**
     * @return the code
     */
    public Long getCode() {
        return code;
    }
    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }
    /**
     * @param encounter the encounter to set
     */
    public void setEncounter(String encounter) {
        this.encounter = encounter;
    }
    /**
     * @return the encounter
     */
    public String getEncounter() {
        return encounter;
    }
    /**
     * @param patient the patient to set
     */
    public void setPatient(String patient) {
        this.patient = patient;
    }
    /**
     * @return the patient
     */
    public String getPatient() {
        return patient;
    }
    /**
     * @param start the start to set
     */
    public void setStart(String start) {
        this.start = start;
    }
    /**
     * @return the start
     */
    public String getStart() {
        return start;
    }
    /**
     * @param stop the stop to set
     */
    public void setStop(String stop) {
        this.stop = stop;
    }
    /**
     * @return the stop
     */
    public String getStop() {
        return stop;
    }
}