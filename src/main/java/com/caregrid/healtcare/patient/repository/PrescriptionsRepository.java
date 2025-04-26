package com.caregrid.healtcare.patient.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.caregrid.healtcare.patient.model.Prescriptions;

public interface PrescriptionsRepository extends JpaRepository<Prescriptions, Long> {

}
