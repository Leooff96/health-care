package com.health.care.repository;

import com.health.care.domain.Allergie;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllergieRepository extends MongoRepository<Allergie,String> {
}