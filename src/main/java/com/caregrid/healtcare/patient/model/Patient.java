package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	private List<MedicalHistory>medicalHistories;
	private List<Prescriptions>prescriptions;
	private List<TestResult>testResults;
	private List<DoctorPatientMapping>doctorMapping;
	
	
	
	
	
	
	

}
