package com.skipps.hospital.Patient;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/patient")
public class PatientController
{
    PatientService patientService;
    PatientController(PatientService patientService)
    {
        this.patientService=patientService;
    }

    @GetMapping
    public List<Patient> getAllPatients()
    {
        return patientService.getAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id)
    {
        return patientService.getPatientById(id);
    }

    @PostMapping
    public Patient createPatient(@RequestBody Patient patient)
    {
        return patientService.createPatient(patient);
    }

    @PutMapping("/{id}")
    public Patient updatePatient(@PathVariable Long id, @RequestBody Patient patient)
    {
        return patientService.updatePatient(id,patient);
    }

    @DeleteMapping("/{id}")
    public void deletePatient(@PathVariable Long id)
    {
        patientService.deletePatient(id);
    }

}
