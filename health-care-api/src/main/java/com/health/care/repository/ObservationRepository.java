package com.health.care.repository;

import java.util.List;

import com.health.care.domain.Observation;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * ObservationsRepository
 */

@Repository
public interface ObservationRepository extends MongoRepository<Observation, String>{

    @Query("{ 'PATIENT':?0 , 'ENCOUNTER':?1  ,'DESCRIPTION':{ $in: ['Body Height','Body Weight','Body Mass Index', 'Systolic Blood Pressure', 'Diastolic Blood Pressure', 'Oral temperature','Triglycerides', 'Total Cholesterol']}}")
    List<Observation> find(String patient,String encounter);
}