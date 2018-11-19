package com.health.care.resources;

import java.util.List;

import com.health.care.config.*;
import com.health.care.domain.Encounter;
import com.health.care.repository.EncounterRepository;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * EncounterResource
 */

@RestController
@RequestMapping(value=Config.PATH_BASE+"/encounter/",produces=MediaType.APPLICATION_XML_VALUE)
public class EncounterResource {

    @Autowired
    private EncounterRepository r;
    
    @GetMapping
    public List<Encounter> listEncounter(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Encounter updateEncounter(Encounter Encounter) {
        return r.save(Encounter);
    }

    @PostMapping
    public Encounter saveEncounter(Encounter Encounter) {
        return r.save(Encounter);
    }

    @DeleteMapping
    public void deleteEncounter(String id) {
        r.deleteById(id);
    }
}