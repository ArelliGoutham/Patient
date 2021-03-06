package com.hospital.patient.repositories;

import com.hospital.patient.entity.Doctor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor, Integer> {

}
