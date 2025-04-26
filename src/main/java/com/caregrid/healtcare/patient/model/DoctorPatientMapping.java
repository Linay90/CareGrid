package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class DoctorPatientMapping {
	private Long id;
	private Long doctorId;
	private LocalDate visitDate;
	private String purposeOfVisit;
	private String diagnosisNotes;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;
	
	
	
	

}
