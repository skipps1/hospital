package com.skipps.hospital.Patient;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientService
{
    List<Patient> getAllPatients();
    Patient getPatientById(Long id);
    Patient createPatient(Patient patient);
    Patient updatePatient(Long id, Patient patient);
    void deletePatient(Long id);
}
