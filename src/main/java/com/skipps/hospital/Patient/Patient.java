package com.skipps.hospital.Patient;

import jakarta.persistence.*;

public class Patient
{
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE,generator="patient_generator")
    @SequenceGenerator(name="patient_generator",sequenceName="patient_id_seq",allocationSize=1)
    @Column(name="patient_id")
    Long id;

    @Column(name="name")
    String name;

    @Column(name="status")
    boolean status;

    @Column(name="phone")
    String phone;

    @Column(name="email")
    String email;

    Patient(){}
    Patient(String name,boolean status,String phone,String email)
    {
        this.name=name;
        this.status=status;
        this.phone=phone;
        this.email=email;
    }

    Long getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    boolean getStatus()
    {
        return status;
    }
    String getPhone()
    {
        return phone;
    }
    String getEmail()
    {
        return email;
    }

    void setName(String name)
    {
        this.name=name;
    }
    void setStatus(boolean status)
    {
        this.status=status;
    }
    void setPhone(String phone)
    {
        this.phone=phone;
    }
    void setEmail(String email)
    {
        this.email=email;
    }
}
