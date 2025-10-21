package com.skipps.hospital.Specialization;

import java.util.List;

public class SpecializationServiceImpl implements SpecializationService
{
    private SpecializationRepository specializationRepository;
    SpecializationServiceImpl(SpecializationRepository specializationRepository)
    {
        this.specializationRepository=specializationRepository;
    }

    @Override
    public List<Specialization> getAllSpecializations()
    {
        return specializationRepository.findAll();
    }

    @Override
    public Specialization getSpecializationById(Long id)
    {
        return specializationRepository.findById(id).orElseThrow(()-> new RuntimeException("Specialization not found with id: "+id));
    }

    @Override
    public Specialization createSpecialization(Specialization specialization)
    {
        return specializationRepository.save(specialization);
    }

    @Override
    public Specialization updateSpecialization(Long id, Specialization specialization)
    {
        Specialization temp = getSpecializationById(id);
        temp.setName(specialization.getName());
        temp.setNotes(specialization.getNotes());
        temp.setMinimumSessionTime(specialization.getMinimumSessionTime());
        return specializationRepository.save(temp);
    }

    @Override
    public void deleteSpecialization(Long id)
    {
        specializationRepository.deleteById(id);
    }
}
