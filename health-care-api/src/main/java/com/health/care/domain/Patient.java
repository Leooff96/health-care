package com.health.care.domain;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.Getter;
import lombok.Setter;

/**
 * Patient
 */

@JacksonXmlRootElement(localName="Patient")
@Document
@Getter @Setter
public class Patient {

    @Id
    private String _id;

    @Field("ID")
    public String id;
    @Field("BIRTHDATE")
    public String birthdate;
    @Field("DEATHDATE")
    public String deathdate;
    @Field("SSN")
    public String ssn;
    @Field("DRIVERS") 
    public String drivers;
    @Field("PASSPORT")
    public String passport; 
    @Field("PREFIX")
    public String prefix;
    @Field("FIRST")
    public String first;
    @Field("LAST")
    public String last;
    @Field("SUFFIX")
    public String suffix; 
    @Field("MAIDEN")
    public String maiden;
    @Field("MARITAL")
    public String marital;
    @Field("RACE")
    public String race;
    @Field("ETHNICITY")
    public String ethnicity; 
    @Field("GENDER")
    public String gender;
    @Field("BIRTHPLACE")
    public String birthplace; 
    @Field("ADDRESS")
    public String address;

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @param birthdate the birthdate to set
     */
    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
    /**
     * @return the birthdate
     */
    public String getBirthdate() {
        return birthdate;
    }
    /**
     * @param birthplace the birthplace to set
     */
    public void setBirthplace(String birthplace) {
        this.birthplace = birthplace;
    }
    /**
     * @return the birthplace
     */
    public String getBirthplace() {
        return birthplace;
    }
    /**
     * @param deathdate the deathdate to set
     */
    public void setDeathdate(String deathdate) {
        this.deathdate = deathdate;
    }
    /**
     * @return the deathdate
     */
    public String getDeathdate() {
        return deathdate;
    }
    /**
     * @param drivers the drivers to set
     */
    public void setDrivers(String drivers) {
        this.drivers = drivers;
    }
    /**
     * @return the drivers
     */
    public String getDrivers() {
        return drivers;
    }
    /**
     * @param ethnicity the ethnicity to set
     */
    public void setEthnicity(String ethnicity) {
        this.ethnicity = ethnicity;
    }
    /**
     * @return the ethnicity
     */
    public String getEthnicity() {
        return ethnicity;
    }
    /**
     * @param first the first to set
     */
    public void setFirst(String first) {
        this.first = first;
    }
    /**
     * @return the first
     */
    public String getFirst() {
        return first;
    }
    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
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
     * @param last the last to set
     */
    public void setLast(String last) {
        this.last = last;
    }
    /**
     * @return the last
     */
    public String getLast() {
        return last;
    }
    /**
     * @param maiden the maiden to set
     */
    public void setMaiden(String maiden) {
        this.maiden = maiden;
    }
    /**
     * @return the maiden
     */
    public String getMaiden() {
        return maiden;
    }
    /**
     * @param marital the marital to set
     */
    public void setMarital(String marital) {
        this.marital = marital;
    }
    /**
     * @return the marital
     */
    public String getMarital() {
        return marital;
    }
    /**
     * @param passport the passport to set
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }
    /**
     * @return the passport
     */
    public String getPassport() {
        return passport;
    }
    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
    /**
     * @return the prefix
     */
    public String getPrefix() {
        return prefix;
    }
    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }
    /**
     * @return the race
     */
    public String getRace() {
        return race;
    }
    /**
     * @param ssn the ssn to set
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    /**
     * @return the ssn
     */
    public String getSsn() {
        return ssn;
    }
    /**
     * @param suffix the suffix to set
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
    /**
     * @return the suffix
     */
    public String getSuffix() {
        return suffix;
    }
}