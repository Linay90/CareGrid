package com.caregrid.healtcare.patient.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.caregrid.healtcare.patient.exceptions.PatientNotFoundException;
import com.caregrid.healtcare.patient.model.Patient;
import com.caregrid.healtcare.patient.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
	@Autowired
	private PatientRepository patientRepository;

	@Override
	public Patient createPatient(Patient patient) {
		return patientRepository.save(patient);
	}

	@Override
	public Patient updatePatient(Long id, Patient updatedPatient) {
		Optional<Patient> existingPatientOpt=patientRepository.findById(id);
		if(existingPatientOpt.isPresent()) {
			Patient existingPatient=existingPatientOpt.get();
			existingPatient.setFirsname(updatedPatient.getFirsname());
            existingPatient.setLastname(updatedPatient.getLastname());
            existingPatient.setGender(updatedPatient.getGender());
            existingPatient.setDateOfBirth(updatedPatient.getDateOfBirth());
            existingPatient.setContactNumber(updatedPatient.getContactNumber());
            existingPatient.setEmail(updatedPatient.getEmail());
            existingPatient.setAddress(updatedPatient.getAddress());
            existingPatient.setBloodType(updatedPatient.getBloodType());
            existingPatient.setInsuranceProvider(updatedPatient.getInsuranceProvider());
            existingPatient.setEmergencyContactName(updatedPatient.getEmergencyContactName());
            existingPatient.setEmergencyContactNumber(updatedPatient.getEmergencyContactNumber());
            existingPatient.setEmergencyContactRelationShip(updatedPatient.getEmergencyContactRelationShip());
            existingPatient.setLastVisitDate(updatedPatient.getLastVisitDate());
            existingPatient.setNextVisitDate(updatedPatient.getNextVisitDate());

            return patientRepository.save(existingPatient);
        } else {
            throw new RuntimeException("Patient not found with id " + id);
        }
    
            
		}
		
		
	

	@Override
	public Patient getPatientById(Long id) {
	    return patientRepository.findById(id)
	            .orElseThrow(() -> new PatientNotFoundException("Patient not found with ID: " + id));
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepository.findAll();
	}

	@Override
	public void deletePatient(Long id) {
		patientRepository.deleteById(id);
		
		
	
	}
	

}
