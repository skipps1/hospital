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

}
