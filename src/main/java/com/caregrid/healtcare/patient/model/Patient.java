package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="patient_id")
	private Long patientId;
	private String firsname;
	private String Lastname;
	private String gender;
	private LocalDate dateOfBirth;
	private String contactNumber;
	private String email;
	private String address;
	
	private String bloodType;
	private String insuranceProvider;
	private String emergencyContactName;
	private String emergencyContactNumber;
	private String emergencyContactRelationShip;
	
	private LocalDate lastVisitDate;
	private LocalDate nextVisitDate;
	private LocalDate nextHealthReminders;
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<MedicalHistory> medicalHistories = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Prescriptions> prescriptions = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TestResult> testResults = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<DoctorPatientMapping>doctorMapping;

	public Long getPatientId() {
		return patientId;
	}

	public void setPatientId(Long patientId) {
		this.patientId = patientId;
	}

	public String getFirsname() {
		return firsname;
	}

	public void setFirsname(String firsname) {
		this.firsname = firsname;
	}

	public String getLastname() {
		return Lastname;
	}

	public void setLastname(String lastname) {
		Lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getInsuranceProvider() {
		return insuranceProvider;
	}

	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}

	public String getEmergencyContactName() {
		return emergencyContactName;
	}

	public void setEmergencyContactName(String emergencyContactName) {
		this.emergencyContactName = emergencyContactName;
	}

	public String getEmergencyContactNumber() {
		return emergencyContactNumber;
	}

	public void setEmergencyContactNumber(String emergencyContactNumber) {
		this.emergencyContactNumber = emergencyContactNumber;
	}

	public String getEmergencyContactRelationShip() {
		return emergencyContactRelationShip;
	}

	public void setEmergencyContactRelationShip(String emergencyContactRelationShip) {
		this.emergencyContactRelationShip = emergencyContactRelationShip;
	}

	public LocalDate getLastVisitDate() {
		return lastVisitDate;
	}

	public void setLastVisitDate(LocalDate lastVisitDate) {
		this.lastVisitDate = lastVisitDate;
	}

	public LocalDate getNextVisitDate() {
		return nextVisitDate;
	}

	public void setNextVisitDate(LocalDate nextVisitDate) {
		this.nextVisitDate = nextVisitDate;
	}

	public LocalDate getNextHealthReminders() {
		return nextHealthReminders;
	}

	public void setNextHealthReminders(LocalDate nextHealthReminders) {
		this.nextHealthReminders = nextHealthReminders;
	}

	public List<MedicalHistory> getMedicalHistories() {
		return medicalHistories;
	}

	public void setMedicalHistories(List<MedicalHistory> medicalHistories) {
		this.medicalHistories = medicalHistories;
	}

	public List<Prescriptions> getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(List<Prescriptions> prescriptions) {
		this.prescriptions = prescriptions;
	}

	public List<TestResult> getTestResults() {
		return testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}

	public List<DoctorPatientMapping> getDoctorMapping() {
		return doctorMapping;
	}

	public void setDoctorMapping(List<DoctorPatientMapping> doctorMapping) {
		this.doctorMapping = doctorMapping;
	}
	
	
	
	
	
	
	

}
