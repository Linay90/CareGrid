package com.caregrid.healtcare.patient.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.caregrid.healtcare.patient.model.MedicalHistory;
import com.caregrid.healtcare.patient.repository.MedicalHistoryRepository;
@Service
public class MedicalHistoryServiceImpl implements MedicalHistoryService {
	private MedicalHistoryRepository medicalHistoryRepository;

	@Override
    public MedicalHistory saveMedicalHistory(MedicalHistory medicalHistory) {
        return medicalHistoryRepository.save(medicalHistory);
    }


	@Override
	public List<MedicalHistory> getMedicalHstoryByPatientId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalHistory updateMedicalHistory(Long id, MedicalHistory medicalHistory) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteMedicalHstory(Long id) {
		// TODO Auto-generated method stub
		 medicalHistoryRepository.deleteById(id);
	}
}