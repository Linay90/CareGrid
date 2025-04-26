package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Prescriptions {
	private Long id;
	private String medicineName;
	private String dosage;
	private LocalDate startDate;
	private LocalDate endDate;
	private String notes;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;
	

}
