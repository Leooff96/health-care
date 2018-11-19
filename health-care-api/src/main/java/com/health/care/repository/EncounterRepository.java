package com.health.care.repository;

import com.health.care.domain.Encounter;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EncounterRepository extends MongoRepository<Encounter,String> {
}