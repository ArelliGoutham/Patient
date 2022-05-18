package com.hospital.patient.responses;

import java.util.Date;

public interface PatientResponse {
    int getId();

    String getName();

    int getAge();

    Date getDateOfVisit();

    String getPrescription();

    String getDoctorName();

    String getSpecialization();
}
