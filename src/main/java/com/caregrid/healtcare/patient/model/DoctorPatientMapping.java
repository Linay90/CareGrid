package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DoctorPatientMapping {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="doctor_id")
	private Long doctorId;
	private LocalDate visitDate;
	private String purposeOfVisit;
	private String diagnosisNotes;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="patient_id")
	private Patient patient;


	

	

	public Long getDoctorId() {
		return doctorId;
	}


	public void setDoctorId(Long doctorId) {
		this.doctorId = doctorId;
	}


	public LocalDate getVisitDate() {
		return visitDate;
	}


	public void setVisitDate(LocalDate visitDate) {
		this.visitDate = visitDate;
	}


	public String getPurposeOfVisit() {
		return purposeOfVisit;
	}


	public void setPurposeOfVisit(String purposeOfVisit) {
		this.purposeOfVisit = purposeOfVisit;
	}


	public String getDiagnosisNotes() {
		return diagnosisNotes;
	}


	public void setDiagnosisNotes(String diagnosisNotes) {
		this.diagnosisNotes = diagnosisNotes;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	
	
	

}
