package com.health.care.resources;


import java.util.List;

import com.health.care.config.Config;
import com.health.care.domain.Claim;
import com.health.care.repository.ClaimRepository;

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
@RequestMapping(value=Config.PATH_BASE+"/claim/",produces=MediaType.APPLICATION_XML_VALUE)
public class ClaimResource {

    @Autowired
    private ClaimRepository r;

    @GetMapping
    public List<Claim> listClaims(@ApiIgnore Pageable page) {
        return r.findAll(page).getContent();
    }

    @PutMapping
    public Claim updateClaim(Claim Claim) {
        return r.save(Claim);
    }

    @PostMapping
    public Claim saveClaim(Claim Claim) {
        return r.save(Claim);
    }

    @DeleteMapping
    public void deleteClaim(String id) {
        r.deleteById(id);
    }
}