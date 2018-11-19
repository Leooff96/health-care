package com.health.care.resources;

import java.util.List;

import com.health.care.config.*;
import com.health.care.domain.Procedure;
import com.health.care.repository.ProcedureRepository;

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


@RestController
@RequestMapping(value=Config.PATH_BASE+"/procedure/",produces=MediaType.APPLICATION_XML_VALUE)
public class ProcedureResource {

    @Autowired
    private ProcedureRepository r;
    
    @GetMapping
    public List<Procedure> listProcedure(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Procedure updateProcedure(Procedure Procedure) {
        return r.save(Procedure);
    }

    @PostMapping
    public Procedure saveProcedure(Procedure Procedure) {
        return r.save(Procedure);
    }

    @DeleteMapping
    public void deleteProcedure(String id) {
        r.deleteById(id);
    }
}