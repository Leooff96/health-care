package com.health.care.domain.eenum;

public enum ObservationEnum {
    BodyHeight("Body Height"), BodyWeight("Body Weight"),
    BodyMassIndex("Body Mass Index"), SystolicBloodPressure("Systolic Blood Pressure"),
    DiastolicBloodPressure("Diastolic Blood Pressure"), OralTemperature("Oral temperature"), 
    Triglycerides("Triglycerides"), TotalCholesterol("Total Cholesterol"),
    Classificacao("Classificacao"),
    Contidion("Condition");

    private String name;
    private String value = ""; 

    ObservationEnum(String name){
        this.name = name;
    }
    public static ObservationEnum getValue(String name){
        for (ObservationEnum obs : ObservationEnum.values()) {
            if(obs.getName().equalsIgnoreCase(name)){
                return obs;
            }
        }
        return null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }
    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }
}