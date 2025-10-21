package com.skipps.hospital.Patient;

import java.util.List;

public class PatientServiceImpl implements PatientService
{
    PatientRepository patientRepository;
    PatientServiceImpl(PatientRepository patientRepository)
    {
        this.patientRepository=patientRepository;
    }

    @Override
    public List<Patient> getAllPatients()
    {
        return patientRepository.findAll();
    }

    @Override
    public Patient getPatientById(Long id)
    {
        return patientRepository.findById(id).orElseThrow(()->new RuntimeException("Patient was not found with id: "+id));
    }

    @Override
    public Patient createPatient(Patient patient)
    {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Long id, Patient patient)
    {
        Patient temp=getPatientById(id);
        temp.setName(patient.getName());
        temp.setStatus(patient.getStatus());
        temp.setPhone(patient.getPhone());
        temp.setEmail(patient.getEmail());
        return patientRepository.save(temp);
    }

    @Override
    public void deletePatient(Long id)
    {
        patientRepository.deleteById(id);
    }
}
