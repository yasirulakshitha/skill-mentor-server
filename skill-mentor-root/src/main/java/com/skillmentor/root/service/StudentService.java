package com.skillmentor.root.service;


import com.skillmentor.root.dto.StudentDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    /**
     * Create new student
     * @return created student
     * @param studentDTO student dto
     * @param studentDTO the data transfer object containing student details
     * @return the created StudentDTO object
     */
    StudentDTO createStudent(StudentDTO studentDTO);

    /**Add commentMore actions
     * Retrieves all students, optionally filtered by age.
     *
     * @return a list of StudentDTO objects representing the students
     */
    List<StudentDTO> getAllStudents();

    /**Add commentMore actions
     * Retrieves a student by their ID.
     *
     * @param id the ID of the student to retrieve
     * @return a StudentDTO object representing the student
     */

    StudentDTO getStudentById(Integer id);

    /**
     * Updates an existing student's details.
     *
     * @param studentDTO the data transfer object containing updated student details
     * @return a StudentDTO object representing the updated student
     */

    StudentDTO updateStudentById(StudentDTO studentDTO);

    /**
     * Deletes a student by their ID.
     *
     * @param id the ID of the student to delete
     * @return a StudentDTO object representing the deleted student
     */
    StudentDTO deleteStudentById(Integer id);
}
