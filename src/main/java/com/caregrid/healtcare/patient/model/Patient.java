package com.caregrid.healtcare.patient.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
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
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<MedicalHistory> medicalHistories = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Prescriptions> prescriptions = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<TestResult> testResults = new ArrayList<>();
	
	@OneToMany(mappedBy = "patient",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<DoctorPatientMapping>doctorMapping;
	
	
	
	
	
	
	

}
