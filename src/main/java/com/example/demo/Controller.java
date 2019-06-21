package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@RestController
public class Controller {


    @Autowired
    StudentRepository studentRepository;

    Random random = new Random();

    @GetMapping("/test")
    public void  insertTestStudent() {
        Student s=new Student();
        s.setName("chotu"+random.nextInt());
        s.setRoll(12);
     //this will crete a random student
        studentRepository.save(s);
    }


    @GetMapping("/list")
    public List<Student> listAllStudent() {
        return studentRepository.findAll();

    }

    @GetMapping("/search/{studentId}")
    public Optional<Student> listAStudent(@PathVariable("studentId") Long studentId) {
        return studentRepository.findById(studentId);
    }


    @GetMapping("/search")
    public Student listnameStudent(@RequestParam("id") Long studentId, @RequestParam("studentName") String studentName) {

        return studentRepository.findByIdAndName(studentId, studentName);

    }


    @DeleteMapping("/delete/{studentId}")
    public void deleteStdent(@PathVariable Long studentId) {
        studentRepository.deleteById(studentId);

    }

    @PutMapping("/update/{studentId}")
    public void updateStdent(@PathVariable Long studentId, @RequestBody Student student) {
       student.setId(studentId);
        studentRepository.save(student);

    }

    @PostMapping("/create")
    public void createStudent(@RequestBody() Student student) {
        studentRepository.save(student);
    }
}
