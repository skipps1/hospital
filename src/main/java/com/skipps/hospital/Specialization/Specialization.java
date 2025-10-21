package com.skipps.hospital.Specialization;

import jakarta.persistence.*;


@Entity
@Table(name="specialization")
public class Specialization
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "specialization_generator")
    @SequenceGenerator(name="specialization_generator",sequenceName="specialization_id_seq",allocationSize=1)
    @Column(name="specialization_id")
    private Long id;

    @Column(name="name")
    private String name;

    @Column(name="notes")
    private String notes;

    @Column(name="minimum_session_time")
    private int minimumSessionTime;

    Specialization(){}
    Specialization(String name,String notes,int minimumSessionTime)
    {
        this.name=name;
        this.notes=notes;
        this.minimumSessionTime=minimumSessionTime;
    }

    //Getters
    Long getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    String getNotes()
    {
        return notes;
    }
    int getMinimumSessionTime()
    {
        return minimumSessionTime;
    }

    //Setters
    void setName(String name)
    {
        this.name=name;
    }
    void setNotes(String notes)
    {
        this.notes=notes;
    }
    void setMinimumSessionTime(int minimumSessionTime)
    {
        this.minimumSessionTime=minimumSessionTime;
    }

}
