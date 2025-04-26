package com.caregrid.healtcare.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caregrid.healtcare.patient.model.MedicalHistory;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory, Long>{

}
