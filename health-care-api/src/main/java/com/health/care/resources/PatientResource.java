package com.health.care.resources;


import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Patient;
import com.health.care.repository.PatientRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/patient/",produces=MediaType.APPLICATION_XML_VALUE)
public class PatientResource {

    @Autowired
    private PatientRepository r;

    @GetMapping
    public List<Patient> getPatients(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Patient updatePatient(Patient Patient) {
        return r.save(Patient);
    }

    @PostMapping
    public Patient savePatient(Patient Patient) {
        return r.save(Patient);
    }

    @DeleteMapping
    public void deletePatient(String id) {
        r.deleteById(id);
    }
}