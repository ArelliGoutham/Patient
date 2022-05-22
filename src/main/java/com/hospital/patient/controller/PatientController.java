package com.hospital.patient.controller;

import com.hospital.patient.entity.Patient;
import com.hospital.patient.responses.PatientResponse;
import com.hospital.patient.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*")
public class PatientController {

    @Autowired
    private PatientService service;

    private PatientResponse response;

    @PostMapping(value = "/patient")
    public ResponseEntity<Patient> bookAppointment(@RequestBody Patient entity) {
        Patient patient = service.savePatient(entity);
        if (patient != null) {
            return new ResponseEntity<Patient>(patient, HttpStatus.CREATED);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(value = "/patient/{id}")
    public ResponseEntity<PatientResponse> getMethodName(@PathVariable String id) {
        response = service.getPatientData(id);
        if (response != null) {
            return new ResponseEntity<PatientResponse>(response, HttpStatus.OK);
        } else if (response == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @PatchMapping(value = "/prescription")
    public ResponseEntity<Patient> postMethodName(@RequestBody Patient entity) {
        service.savePrescription(entity);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
