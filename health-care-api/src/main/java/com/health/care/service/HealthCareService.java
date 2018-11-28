package com.health.care.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

import com.health.care.domain.Classificacao;
import com.health.care.domain.Condition;
import com.health.care.domain.Encounter;
import com.health.care.domain.Observation;
import com.health.care.domain.Patient;
import com.health.care.domain.eenum.ObservationEnum;
import com.health.care.repository.ConditionRepository;
import com.health.care.repository.EncounterRepository;
import com.health.care.repository.ObservationRepository;
import com.health.care.repository.PatientRepository;
import com.health.care.service.dto.ConditionDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableArgumentResolver;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * HealthCareService
 */

 @Service
public class HealthCareService {

    @Autowired
    private ConditionRepository con;

    
    @Autowired
    private ObservationRepository obs;

    Map<String,String> map = new HashMap<>();

    public List<String[]> dadosConsolidados2(){
        List<String[]> result = new ArrayList<>();
        Map<Long,Integer> cls = new HashMap<>();
        for (Condition c : con.findByPatientAndEncounter()) {
            List<Observation> observations = this.obs.find(c.getPatient(),c.getEncounter());
            String[] e = new String[ObservationEnum.values().length];
            for (Observation o : observations) {
                ObservationEnum x = ObservationEnum.getValue(o.getDescription());
                e[x.ordinal()]=(o.getValue());
            }
            if(!observations.isEmpty()){
                e[ObservationEnum.Contidion.ordinal()]=(c.getCode().toString());
                
                if(!cls.containsKey(c.getCode())){
                    cls.put(c.getCode(), getCls());
                }
                
                e[ObservationEnum.Classificacao.ordinal()]=(String.valueOf(cls.get(c.getCode())));
                
                result.add(e);
            }
        }
        return result;
    }

    private Integer getCls(){
        Random random = new Random();
        return Classificacao.values()[random.nextInt(Classificacao.values().length)].ordinal();
    }
}