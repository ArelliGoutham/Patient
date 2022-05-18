package com.hospital.patient.controller;

import org.springframework.web.bind.annotation.RestController;

import com.hospital.patient.entity.Patient;
import com.hospital.patient.responses.PatientResponse;
import com.hospital.patient.service.PatientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping(value = "/patient/{id}")
    public PatientResponse getMethodName(@PathVariable int id) {
        return service.getPatientData(id);
    }

}
