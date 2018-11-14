package com.smart.health.resources;


import java.util.List;

import com.smart.health.config.Config;
import com.smart.health.domain.Condition;
import com.smart.health.repository.ConditionRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/condition/",produces=MediaType.APPLICATION_XML_VALUE)
public class ConditionResource {

    @Autowired
    private ConditionRepository r;

    @GetMapping
    public List<Condition> listConditions(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Condition updateCondition(Condition Condition) {
        return r.save(Condition);
    }

    @PostMapping
    public Condition saveCondition(Condition Condition) {
        return r.save(Condition);
    }

    @DeleteMapping
    public void deleteCondition(String id) {
        r.deleteById(id);
    }
}