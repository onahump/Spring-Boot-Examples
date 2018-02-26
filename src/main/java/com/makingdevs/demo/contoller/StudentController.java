package com.makingdevs.demo.contoller;

import com.makingdevs.demo.model.Student;
import com.makingdevs.demo.service.StudentService;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE,
            path = "{studentId}"
    )

    public Student getStudendbyId(@PathVariable("studentId") UUID studentId){
        return studentService.getStudentById(studentId);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            consumes = MediaType.APPLICATION_JSON_VALUE
    )
    public void insertNewStudent(@RequestBody Student student){
        studentService.persistNewStudent(UUID.randomUUID(), student);
    }

    @RequestMapping(
            method = RequestMethod.PUT,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            path = "{studentId}"
    )

    public void updateStudend(@PathVariable("studentId") UUID studentId, @RequestBody Student student){
        studentService.updateStudentById(studentId, student);
    }

    @RequestMapping(
            method = RequestMethod.DELETE,
            path = "{studentId}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )

    public void deleteStudendById(@PathVariable("studentId") UUID studentId){
        studentService.deleteStudentById(studentId);
    }

}