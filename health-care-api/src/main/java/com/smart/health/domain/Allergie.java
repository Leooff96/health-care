package com.smart.health.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


@Document
@JacksonXmlRootElement(localName="allergie")
public class Allergie{

    @Id
    private String _id;
    @Field("START")
    private String start;
    @Field("STOP")
    private String stop;
    @Field("PATIENT")
    private String patient;
    @Field("CODE")
    private Integer code;
    @Field("DESCRIPTION")
    private String description;

    /**
     * @return the start
     */
    public String getStart() {
        return start;
    }
    /**
     * @param start the start to set
     */
    public void setStart(String start) {
        this.start = start;
    }
    /**
     * @param code the code to set
     */
    public void setCode(Integer code) {
        this.code = code;
    }
    /**
     * @return the code
     */
    public Integer getCode() {
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