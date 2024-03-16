package org.example.springbootjparep.service;

import org.example.springbootjparep.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudent();

    public void saveStudent(Student student);

    public Student getStudent(int id);

    public void deleteStudent(int id);

    public List<Student> findAllByName(String name);

    public List<Student> findAllByGpaLessThan(double gpa);
}
