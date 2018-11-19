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
public class Claim{

    @Id
    private String _id;
    @Field("PATIENT")
    private String patient;
    @Field("BILLABLEPERIOD")
    private String billableperiod;
    @Field("TOTAL")
    private Integer total;
    @Field("ORGANIZATION")
    private String organization;
    @Field("ENCOUNTER")
    private String encounter;
    @Field("DIAGNOSIS")
    private String diagnosis;

    /**
     * @param billableperiod the billableperiod to set
     */
    public void setBillableperiod(String billableperiod) {
        this.billableperiod = billableperiod;
    }
    /**
     * @return the billableperiod
     */
    public String getBillableperiod() {
        return billableperiod;
    }
    /**
     * @param diagnosis the diagnosis to set
     */
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    /**
     * @return the diagnosis
     */
    public String getDiagnosis() {
        return diagnosis;
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
     * @param organization the organization to set
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }
    /**
     * @return the organization
     */
    public String getOrganization() {
        return organization;
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
     * @param total the total to set
     */
    public void setTotal(Integer total) {
        this.total = total;
    }
    /**
     * @return the total
     */
    public Integer getTotal() {
        return total;
    }
}