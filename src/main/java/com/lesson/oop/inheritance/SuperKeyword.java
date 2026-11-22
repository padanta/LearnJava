package com.lesson.oop.inheritance;

import java.util.Date;

public class SuperKeyword {
    public static void main(String[] args) {
        Karyawan danta = new Karyawan("danta", 2002, "batam", new Date(), 2000L);
        System.out.println(danta.getName());
        System.out.println(danta.getAddress());
        System.out.println(danta.getYearOfBirth());
        System.out.println(danta.getStartDate());
        System.out.println(danta.getSalary());
        danta.printSubField();

    }
}

class Karyawan extends Orang {

    private Date startDate;
    private Long salary;
    private int field;

    public Karyawan(String name, int yearOfBirth, String address, Date startDate, Long salary) {
        super(name, yearOfBirth, address); // invoking a constructor of the superclass

        this.startDate = startDate;
        this.salary = salary;

        this.field = 25;
        super.setField(50);
    }

    void printSubField(){
        super.printBaseField();
        super.setField(100);
        System.out.println(super.getField());
        System.out.println(field);
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }
}

class Orang {

    private String name;
    private int yearOfBirth;
    private String address;
    private int field;

    void printBaseField(){
        System.out.println(field);
    }

    public Orang(String name, int yearOfBirth, String address) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.address = address;
    }

    public int getField() {
        return field;
    }

    public void setField(int field) {
        this.field = field;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}