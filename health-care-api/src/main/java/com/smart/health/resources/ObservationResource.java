package com.smart.health.resources;


import java.util.List;

import com.smart.health.config.Config;
import com.smart.health.domain.Observation;
import com.smart.health.repository.ObservationRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/observation/",produces=MediaType.APPLICATION_XML_VALUE)
public class ObservationResource {

    @Autowired
    private ObservationRepository r;

    @GetMapping
    public List<Observation> listObservations(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Observation updateObservation(Observation observation) {
        return r.save(observation);
    }

    @PostMapping
    public Observation saveObservation(Observation observation) {
        return r.save(observation);
    }

    @DeleteMapping
    public void deleteObservation(String id) {
        r.deleteById(id);
    }
}