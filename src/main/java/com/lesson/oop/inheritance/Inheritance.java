package com.lesson.oop.inheritance;

import java.util.Arrays;
import java.util.Date;

// you can't extend from a class with final keyword

public class Inheritance {
    public static void main(String[] args) {
        Programmer danta = new Programmer();

        danta.setName("Muhammad Padanta Tarigan");
        danta.setYearOfBirth(2002);
        danta.setAddress("Indonesia");
        danta.setDateOfWork(new Date());
        danta.setSalary(2_000_000);
        danta.setProgrammingLanguages(new String[]{"Java", "Cpp"});

        System.out.println(danta.getName());
        System.out.println(Arrays.toString(danta.getProgrammingLanguages()));
        System.out.println(danta.salary);
    }
}

class Person {
    protected String name;
    protected int yearOfBirth;
    protected String address;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getYearOfBirth(){
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth){
        this.yearOfBirth = yearOfBirth;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }
}

class Customer extends Person{
    protected int contractNumber;
    protected String status;

    public int getContractNumber(){
        return contractNumber;
    }

    public void setContractNumber(int contractNumber){
        this.contractNumber = contractNumber;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}

class Employee extends Person{
    protected Date dateOfWork;
    protected long salary;

    public Date getDateOfWork(){
        return dateOfWork;
    }

    public void setDateOfWork(Date dateOfWork){
        this.dateOfWork = dateOfWork;
    }

    public long getSalary(){
        return salary;
    }

    public void setSalary(long salary){
        this.salary = salary;
    }
}

class Programmer extends Employee{
    protected String[] programmingLanguages;

    public String[] getProgrammingLanguages(){
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String[] programmingLanguages){
        this.programmingLanguages = programmingLanguages;
    }
}

class Manager extends Employee{
    protected boolean smile;

    public boolean isSmile(){
        return smile;
    }

    public void setSmile(boolean smile){
        this.smile = smile;
    }
}