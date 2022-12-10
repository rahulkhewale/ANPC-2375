package com.labtest.jpa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.labtest.entity.Patient;
import com.labtest.patientservice.PatientService;


@RestController


// rest controller to handle all incoming request using REST API  

public class PatientController {
	
	@Autowired
	private PatientService patientservice;
	
	// saving Patient details using post mapping
	@PostMapping("/savepatient")
	public ResponseEntity<Patient> saveP(@Valid @RequestBody Patient Patient){
		return new ResponseEntity<Patient>(patientservice.savePatient(Patient),HttpStatus.CREATED);
	}
	
	// fetching Patient details using id using get mapping
	@GetMapping("/getpatient/{patientid}")
	public ResponseEntity<Patient> getP(long patientId){
		return new ResponseEntity<Patient>(patientservice.getByIdPatient(patientId), HttpStatus.OK);
	}
	
	//updating Patient details by id using put mapping
	@PutMapping("/updatepatient/{patientid}")
	public ResponseEntity<Patient> updateP ( @PathVariable("patientid") @RequestBody long patientId){
		return new ResponseEntity<Patient>(patientservice.getByIdPatient(patientId), HttpStatus.OK);
	}
	
	// deleting Patient details by id using post mapping
	@DeleteMapping("/deletpatient/{patientid}")
	public ResponseEntity<String> deleteP ( @PathVariable("patientid") @RequestBody long patientid){
		patientservice.delateByIdPatient(patientid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}
	
	// fetching Patient details using get mapping
	@GetMapping("/gett")
	public List<Patient> getAllP(){
		return patientservice.getAllPatients();
	}
	
	

}
