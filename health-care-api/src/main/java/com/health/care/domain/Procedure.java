package com.health.care.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement(localName="Procedure")
@Setter @Getter
@Document
public class Procedure{

    @Id
    private String _id;

    @Field("DATE")
    private String date;
    @Field("PATIENT")
    private String patient;
    @Field("ENCOUNTER")
    private String encounter;
    @Field("CODE")
    private Double code;
    @Field("DESCRIPTION")
    private String description;
    @Field("REASONCODE")
    private Double reasoncode;
    @Field("REASONDESCRIPTION")
    private String reasondescription;

    /**
     * @param code the code to set
     */
    public void setCode(Double code) {
        this.code = code;
    }
    /**
     * @return the code
     */
    public Double getCode() {
        return code;
    }
    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }
    /**
     * @return the date
     */
    public String getDate() {
        return date;
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
     * @param reasoncode the reasoncode to set
     */
    public void setReasoncode(Double reasoncode) {
        this.reasoncode = reasoncode;
    }
    /**
     * @return the reasoncode
     */
    public Double getReasoncode() {
        return reasoncode;
    }
    /**
     * @param reasondescription the reasondescription to set
     */
    public void setReasondescription(String reasondescription) {
        this.reasondescription = reasondescription;
    }
    /**
     * @return the reasondescription
     */
    public String getReasondescription() {
        return reasondescription;
    }
}