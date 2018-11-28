package com.health.care.repository;

import java.util.List;

import com.health.care.domain.Encounter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends MongoRepository<Encounter,String> {

    @Query("{ 'PATIENT' : ?0 }")
    List<Encounter> findEncounterByPatient(String patient);
}