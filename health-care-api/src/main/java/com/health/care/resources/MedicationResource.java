package com.health.care.resources;


import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Medication;
import com.health.care.repository.MedicationRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/medication/",produces=MediaType.APPLICATION_XML_VALUE)
public class MedicationResource {

    @Autowired
    private MedicationRepository r;

    @GetMapping
    public List<Medication> listMedications(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Medication updateMedication(Medication Medication) {
        return r.save(Medication);
    }

    @PostMapping
    public Medication saveMedication(Medication Medication) {
        return r.save(Medication);
    }

    @DeleteMapping
    public void deleteMedication(String id) {
        r.deleteById(id);
    }
}