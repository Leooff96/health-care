package com.health.care.resources;


import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Immunization;
import com.health.care.repository.ImmunizationRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/immunization/",produces=MediaType.APPLICATION_XML_VALUE)
public class ImmunizationResource {

    @Autowired
    private ImmunizationRepository r;

    @GetMapping
    public List<Immunization> listImmunizations(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Immunization updateImmunization(Immunization Immunization) {
        return r.save(Immunization);
    }

    @PostMapping
    public Immunization saveImmunization(Immunization Immunization) {
        return r.save(Immunization);
    }

    @DeleteMapping
    public void deleteImmunization(String id) {
        r.deleteById(id);
    }
}