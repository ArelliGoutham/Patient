package com.hospital.patient.service;

import com.hospital.patient.entity.Patient;
import com.hospital.patient.repositories.PatientRepo;
import com.hospital.patient.responses.PatientResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {

    @Autowired
    private PatientRepo repo;

    public PatientResponse getPatientData(String id) {
        return repo.getPatientDetails(id);
    }

    public void savePrescription(Patient entity) {
        repo.savePrescription(entity.getId(), entity.getPrescription());
    }

    public Patient savePatient(Patient entity) {
        try {
            return repo.save(entity);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
