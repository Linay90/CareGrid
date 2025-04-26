package com.caregrid.healtcare.patient.service;

import java.util.List;

import com.caregrid.healtcare.patient.model.MedicalHistory;

public interface MedicalHistoryService {
	MedicalHistory saveMedicalHistory(MedicalHistory medicalhistory);
	List<MedicalHistory>getMedicalHstoryByPatientId(Long id);
	MedicalHistory updateMedicalHistory(Long id,MedicalHistory medicalHistory);
	void deleteMedicalHstory(Long id);
	

}
