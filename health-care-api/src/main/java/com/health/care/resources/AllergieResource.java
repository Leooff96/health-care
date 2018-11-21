package com.health.care.resources;


import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Allergie;
import com.health.care.repository.AllergieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping(value=Config.PATH_BASE+"/allergie/",produces=MediaType.APPLICATION_XML_VALUE)
public class AllergieResource {

    @Autowired
    private AllergieRepository r;

    @GetMapping
    public List<Allergie> listAllergies(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Allergie updateAllergie(Allergie Allergie) {
        return r.save(Allergie);
    }

    @PostMapping
    public Allergie saveAllergie(Allergie Allergie) {
        return r.save(Allergie);
    }

    @DeleteMapping
    public void deleteAllergie(String id) {
        r.deleteById(id);
    }
}