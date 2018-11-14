package com.smart.health.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

@JacksonXmlRootElement
@Setter @Getter
@Document
public class Medication{

    @Id
    private String _id;
    @Field("START")
    private String start;
    @Field("PATIENT")
    private String patient;
    @Field("STOP")
    private String stop;
    @Field("CODE")
    private Integer code;
    @Field("DESCRIPTION")
    private String description;
    @Field("REASONCODE")
    private Integer reasoncode;
    @Field("REASONDESCRIPTION")
    private String reasondescription;


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
     * @return the reasoncode
     */
    public Integer getReasoncode() {
        return reasoncode;
    }
    /**
     * @param reasoncode the reasoncode to set
     */
    public void setReasoncode(Integer reasoncode) {
        this.reasoncode = reasoncode;
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