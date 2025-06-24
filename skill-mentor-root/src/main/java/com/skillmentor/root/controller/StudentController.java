package com.skillmentor.root.controller;


import com.skillmentor.root.dto.StudentDTO;
import com.skillmentor.root.service.StudentService;
import com.skillmentor.root.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/student")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping()
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO) {
        studentService.createStudent(studentDTO);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @GetMapping()
    public ResponseEntity<List<StudentDTO>> getAllStudents(@RequestParam(required = false) Integer age){
        List<StudentDTO> studentDTOS = studentService.getAllStudents(age);
        return new ResponseEntity<>(studentDTOS, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> findStudentById(@PathVariable Integer id){
        StudentDTO student = studentService.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping()
    public ResponseEntity<StudentDTO> updateStudent(@RequestBody StudentDTO studentDTO) {
        StudentDTO student = studentService.updateStudentById(studentDTO);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<StudentDTO> deleteStudent(@PathVariable Integer id){
        StudentDTO student = studentService.deleteStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

}
