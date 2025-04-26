package com.caregrid.healtcare.patient.service;

import java.util.List;

import com.caregrid.healtcare.patient.model.Patient;

public interface PatientService {
	Patient createPatient(Patient patient);
	Patient updatePatient(Long id,Patient upatedPatient);
	Patient getPatientById(Long id);
	List<Patient>getAllPatients();
	void deletePatient(Long id);
	

}
