package org.example.springbootjparep.dao;

import org.example.springbootjparep.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    public List<Student> findAllByName(String name);

    public List<Student> findAllByGpaLessThan(double gpa);
}
