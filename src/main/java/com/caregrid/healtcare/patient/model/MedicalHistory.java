package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class MedicalHistory {
	private Long id;
	private LocalDate diagnosiDate;
	private String treatmentDescription;
	private boolean isChronic;
	@ManyToOne
	@JoinColumn()
	private Patient patient;

}
