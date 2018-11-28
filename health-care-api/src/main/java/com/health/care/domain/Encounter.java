package com.health.care.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement
@Setter @Getter
@Document
public class Encounter{

    @Id
    private String _id;
    @Field("ID")
    private String id;
    @Field("DATE")
    private String date;
    @Field("PATIENT")
    private String patient;
    @Field("CODE")
    private Long code;
    @Field("DESCRIPTION")
    private String description;
    @Field("REASONCODE")
    private String reasoncode;
    @Field("REASONDESCRIPTION")
    private String reasondescription;

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
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }
    /**
     * @return the id
     */
    public String getId() {
        return id;
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
    public void setReasoncode(String reasoncode) {
        this.reasoncode = reasoncode;
    }
    /**
     * @return the reasoncode
     */
    public String getReasoncode() {
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