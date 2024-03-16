package org.example.springbootjparep.controllers;


import org.example.springbootjparep.entity.Student;
import org.example.springbootjparep.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/student")
    public List<Student> show() {
        return studentService.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student id: " + id + " was deleted";
    }

    @GetMapping("/student/byname/{name}")
    public List<Student> getStudentByName(@PathVariable String name){
        List<Student> allByName = studentService.findAllByName(name);
        return allByName;
    }

    @GetMapping("/student/lessgpa/{gpa}")
    public List<Student> getStudentLessGpa(@PathVariable double gpa){
        List<Student> allLessGpa = studentService.findAllByGpaLessThan(gpa);
        return allLessGpa;
    }
}

