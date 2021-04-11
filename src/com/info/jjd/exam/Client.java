package com.info.jjd.exam;

import java.time.LocalTime;
import java.util.Objects;

public class Client {
    private String name;
    private String surname;
    private int yearOfBirth;


    public Client(String name, String surname, int yearOfBirth) {
        setName(name);
        setSurname(surname);
        setYearOfBirth(yearOfBirth);
    }

    public void setName(String name) {
        Objects.requireNonNull(name,"name не может быть null");
        this.name = name;
    }

    public void setSurname(String surname) {
        Objects.requireNonNull(surname,"surname нее может быть null");
        this.surname = surname;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth <= 0 || yearOfBirth > 2005) throw new IllegalArgumentException("Тебе нельзя посещать фитнес клуб");
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }
}
