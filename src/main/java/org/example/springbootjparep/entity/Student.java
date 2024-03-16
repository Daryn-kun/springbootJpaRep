package org.example.springbootjparep.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student_old")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "gpa")
    private double gpa;

    @Column(name = "phone_number")
    private String phone;

    public Student() {
    }

    public Student(String name, double gpa, String phone) {
        this.name = name;
        this.gpa = gpa;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gpa=" + gpa +
                ", phone='" + phone + '\'' +
                '}';
    }


}
