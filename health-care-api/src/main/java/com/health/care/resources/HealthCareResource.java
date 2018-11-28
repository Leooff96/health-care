package com.health.care.resources;


import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Allergie;
import com.health.care.domain.eenum.ObservationEnum;
import com.health.care.repository.AllergieRepository;
import com.health.care.service.HealthCareService;
import com.health.care.service.dto.ConditionDTO;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value=Config.PATH_BASE+"/healthcare/")
public class HealthCareResource {

    @Autowired
    private HealthCareService ser;

    @GetMapping
    public String list(@ApiIgnore Pageable page) {

        Writer sw = new StringWriter();

        //StatefulBeanToCsv x = new StatefulBeanToCsv().bui

        
        CSVWriter csvWriter = new CSVWriter(sw,
        ';',
        CSVWriter.NO_QUOTE_CHARACTER,
        CSVWriter.DEFAULT_ESCAPE_CHARACTER,
        CSVWriter.DEFAULT_LINE_END);

        String[] headerRecord = new String[ObservationEnum.values().length];
        for (ObservationEnum obs : ObservationEnum.values()) {
            headerRecord[obs.ordinal()] = obs.name();
        }

        csvWriter.writeNext(headerRecord);

        for(String[] bodyRecord : ser.dadosConsolidados2()){
            csvWriter.writeNext(bodyRecord);
        }

        try {
            csvWriter.close();
        } catch (Exception e) {
            //TODO: handle exception
        }

        return sw.toString();
    }
}