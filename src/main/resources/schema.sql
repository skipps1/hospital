CREATE DATABASE IF NOT EXISTS hospital;

CREATE TABLE IF NOT EXISTS specialization(
    specialization_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    notes TEXT,
    minimum_session_time INT
);

CREATE TABLE IF NOT EXISTS doctor(
    doctor_id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    rating FLOAT,
    specialization INT REFERENCES specialization(specialization_id) ON DELETE SET NULL,
    email TEXT,
    phone VARCHAR(15)
);

CREATE TABLE IF NOT EXISTS doctor_to_specialization(
    doctor_id INT REFERENCES doctor(doctor_id) ON DELETE CASCADE,
    specialization_id INT REFERENCES specialization(specialization_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS patient(
    patient_id SERIAL PRIMARY KEY,
    name VARCHAR(50),
    status BOOLEAN DEFAULT TRUE,
    phone varchar(15),
    email TEXT
);

CREATE TABLE IF NOT EXISTS appointment(
    appointment_id SERIAL,
    doctor_id INT REFERENCES doctor(doctor_id) ON DELETE CASCADE,
    patient_id INT REFERENCES patient(patient_id) ON DELETE CASCADE,
    time TIMESTAMP,
    notes TEXT
);

CREATE TABLE IF NOT EXISTS review(
    review_id SERIAL,
    text TEXT,
    rating INT,
    doctor_id INT REFERENCES doctor(doctor_id) ON DELETE CASCADE,
    patient_id INT REFERENCES patient(patient_id) ON DELETE CASCADE
);

CREATE SEQUENCE IF NOT EXISTS specialization_id_seq;
CREATE SEQUENCE IF NOT EXISTS doctor_id_seq;
CREATE SEQUENCE IF NOT EXISTS patient_id_seq;
CREATE SEQUENCE IF NOT EXISTS review_id_seq;
CREATE SEQUENCE IF NOT EXISTS appointment_id_seq;
