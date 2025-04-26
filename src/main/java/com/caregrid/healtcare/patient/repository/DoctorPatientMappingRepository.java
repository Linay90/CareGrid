package com.caregrid.healtcare.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caregrid.healtcare.patient.model.DoctorPatientMapping;

public interface DoctorPatientMappingRepository extends JpaRepository<DoctorPatientMapping, Long> {

}
