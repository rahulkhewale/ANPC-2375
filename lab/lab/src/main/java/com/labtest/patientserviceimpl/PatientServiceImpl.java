package com.labtest.patientserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.labtest.entity.Patient;
import com.labtest.exception.PatientNotFoundException;

import com.labtest.patientservice.PatientService;
import com.labtest.repository.PatientRepository;


@Service
// implement all CRUD method , all business logic
public class PatientServiceImpl implements PatientService{
	
	@Autowired
	PatientRepository prepo;

	@Override
	// saving Patient details using save() of JpaRepository
	public Patient savePatient(Patient patient) {
		
		return prepo.save(patient);
	}

	@Override
	// fetching  Patient details from table based on id, if not found then throw exception
	public Patient getByIdPatient(long patientId) {
		
		return prepo.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Entered Patient Id does not exist"));
	}

	@Override
	// fetching all Patient details from table using findAll() of JpaRepository
	public List<Patient> getAllPatients() {
		
		return prepo.findAll();
	}

	@Override
	//updating Patient details based on id from table using save()
	public Patient updateByIdPatient(Patient patient, long patientId) {
		Patient patient1 = prepo.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Entered Patient Id does not exist"));
		
		// set new values
		patient1.setPatientEmail(patient.getPatientEmail());
		patient1.setPhone(patient.getPhone());
		return patient1;
	}

	@Override
	// remove Patient details based on id from table using deleteById()
	public void delateByIdPatient(long patientId) {
		
		 prepo.findById(patientId).orElseThrow(() -> new PatientNotFoundException("Entered Patient Id does not exist"));
	prepo.deleteById(patientId);
	}
	

}
