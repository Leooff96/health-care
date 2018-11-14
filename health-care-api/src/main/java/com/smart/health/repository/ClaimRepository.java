package com.smart.health.repository;

import com.smart.health.domain.Claim;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClaimRepository extends MongoRepository<Claim,String> {
}