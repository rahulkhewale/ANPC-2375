package com.labtest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.labtest.entity.Patient;





// jpaRepository
public interface PatientRepository extends JpaRepository <Patient, Long> {

}
