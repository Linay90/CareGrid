package com.caregrid.healtcare.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caregrid.healtcare.patient.model.TestResult;

public interface TestResultRepository extends JpaRepository<TestResult, Long> {

}
