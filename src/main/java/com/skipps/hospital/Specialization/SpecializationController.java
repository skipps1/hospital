package com.skipps.hospital.Specialization;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/specialization")
public class SpecializationController
{
    private SpecializationService specializationService;

    SpecializationController(SpecializationService specializationService)
    {
        this.specializationService=specializationService;
    }

    @GetMapping
    public List<Specialization> getAllSpecializations()
    {
        return specializationService.getAllSpecializations();
    }

    @GetMapping("/{id}")
    public Specialization getSpecializationById(@PathVariable Long id)
    {
        return specializationService.getSpecializationById(id);
    }

    @PostMapping
    public Specialization createSpecialization(@RequestBody Specialization specialization)
    {
        return specializationService.createSpecialization(specialization);
    }

    @PutMapping("/{id}")
    public Specialization updateSpecialization(@PathVariable Long id, @RequestBody Specialization specialization)
    {
        return specializationService.updateSpecialization(id,specialization);
    }

    @DeleteMapping("/{id}")
    public void deleteSpecialization(@PathVariable Long id)
    {
        specializationService.deleteSpecialization(id);
    }

}
