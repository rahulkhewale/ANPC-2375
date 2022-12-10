package com.labtest.patientservice;

import java.util.List;

import com.labtest.entity.Patient;





//abstract method for performing CRUD on entity Patient
public interface PatientService {
	
	//method for saving Patient details
	Patient savePatient(Patient pass);
	
	// method for fetching Patient detail based on pid
	Patient getByIdPatient(long pid);

	// method for fetching all Patient details
	List<Patient> getAllPatients();
	
	// method for updating Patient details based on pid
	Patient updateByIdPatient(Patient pass, long pid);
	
	// method for removing Patient details based on pid
	void delateByIdPatient(long pid);
	
}
