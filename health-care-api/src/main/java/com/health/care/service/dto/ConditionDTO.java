package com.health.care.service.dto;

import java.util.Map;

import com.health.care.domain.eenum.ObservationEnum;
/**
 * ConditionDTO
 */
public class ConditionDTO {

    private String contidion;
    private String contidionValue;
    private String classificacao;
    private ObservationEnum[] obs;
    
    /**
     * @return the classificacao
     */
    public String getClassificacao() {
        return classificacao;
    }
    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    /**
     * @return the contidion
     */
    public String getContidion() {
        return contidion;
    }
    /**
     * @param contidion the contidion to set
     */
    public void setContidion(String contidion) {
        this.contidion = contidion;
    }
    // /**
    //  * @return the obs
    //  */
    // public Map<String, String> getObs() {
    //     return obs;
    // }
    // /**
    //  * @param obs the obs to set
    //  */
    // public void setObs(Map<String, String> obs) {
    //     this.obs = obs;
    // }

    /**
     * @return the obs
     */
    public ObservationEnum[] getObs() {
        return obs;
    }
    /**
     * @param obs the obs to set
     */
    public void setObs(ObservationEnum[] obs) {
        this.obs = obs;
    }

    /**
     * @return the contidionValue
     */
    public String getContidionValue() {
        return contidionValue;
    }
    /**
     * @param contidionValue the contidionValue to set
     */
    public void setContidionValue(String contidionValue) {
        this.contidionValue = contidionValue;
    }
}