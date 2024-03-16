package org.example.springbootjparep.service;

import jakarta.transaction.Transactional;
import org.example.springbootjparep.dao.StudentRepository;
import org.example.springbootjparep.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Student getStudent(int id) {
        Student student = null;
        Optional<Student> optionalStudent = studentRepository.findById(id);
        if (optionalStudent.isPresent()){
            student = optionalStudent.get();
        } else {
            System.out.println("Error occured, id does not exist");
        }
        return student;
    }

    @Override
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

    @Override
    public List<Student> findAllByName(String name) {
        List<Student> allByName = studentRepository.findAllByName(name);
        return allByName;
    }

    @Override
    public List<Student> findAllByGpaLessThan(double gpa) {
        List<Student> allLessGpa = studentRepository.findAllByGpaLessThan(gpa);
        return allLessGpa;
    }
}

