package com.hospital.patient.repositories;

import com.hospital.patient.entity.Patient;
import com.hospital.patient.responses.PatientResponse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepo extends JpaRepository<Patient, Integer> {

    @Query(nativeQuery = true, value = "select p.id as id,p.name as name,p.age as age,p.date_of_visit as dateOfVisit,p.prescription as prescription, d.name as doctorName,d.specialization as specialization from patient p join doctor d on p.doctor_id = d.id where p.id = :id")
    public PatientResponse getPatientDetails(String id);
}
