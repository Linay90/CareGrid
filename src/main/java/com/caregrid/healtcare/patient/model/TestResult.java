package com.caregrid.healtcare.patient.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class TestResult {
	private Long id;
	private String testName;
	private String testDate;
	private String resultSummary;
	private String reportURL;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="doctor_id")
	
    private Patient patient;

}
