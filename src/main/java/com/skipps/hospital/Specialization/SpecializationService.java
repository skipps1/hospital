package com.skipps.hospital.Specialization;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SpecializationService
{
    List<Specialization> getAllSpecializations();
    Specialization getSpecializationById(Long id);
    Specialization createSpecialization(Specialization specialization);
    Specialization updateSpecialization(Long id, Specialization specialization);
    void deleteSpecialization(Long id);
}
