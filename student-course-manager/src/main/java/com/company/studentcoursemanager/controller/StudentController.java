package com.company.studentcoursemanager.controller;

import com.company.studentcoursemanager.model.Student;
import com.company.studentcoursemanager.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Student createStudent(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @PutMapping(value ="/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateStudentById(@RequestBody Student student, @PathVariable Integer id) {
        if(student.getId() == null) {
            student.setId(id);
        }
        studentRepo.save(student);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteStudentById(@PathVariable Integer id) {
        Student student = new Student();
        if(student.getId() == null) {
            student.setId(id);
        }
        studentRepo.delete(student);
    }
}
