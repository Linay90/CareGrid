package com.caregrid.healtcare.patient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caregrid.healtcare.patient.model.Patient;
import com.caregrid.healtcare.patient.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient) {
		// TODO Auto-generated method stub
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatient(Long id, Patient upatedPatient) {
		return upatedPatient;
		
	}

	@Override
	public Patient getPatientById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Patient> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePatient(Long id) {
		// TODO Auto-generated method stub
		
	}
	

}
