package com.skillmentor.root.service;

import com.skillmentor.root.dto.MentorDTO;

import java.util.List;

/**
 * Service interface for managing mentors.
 */
public interface MentorService {

    /**
     * Creates a new mentor.
     *
     * @param mentorDTO the data transfer object containing mentor details
     * @return the created MentorDTO object
     */
    MentorDTO createMentor(MentorDTO mentorDTO);

    /**
     * Retrieves all mentors.
     *
     * @return a list of MentorDTO objects representing all mentors
     */
    List<MentorDTO> getAllMentors();

    /**
     * Retrieves a mentor by their ID.
     *
     * @param id the ID of the mentor to retrieve
     * @return a MentorDTO object representing the mentor
     */
    MentorDTO getMentorById(Integer id);

    /**
     * Updates an existing mentor's details.
     *
     * @param mentorDTO the data transfer object containing updated mentor details
     * @return a MentorDTO object representing the updated mentor
     */
    MentorDTO updateMentorById(MentorDTO mentorDTO);

    /**
     * Deletes a mentor by their ID.
     *
     * @param id the ID of the mentor to delete
     * @return a MentorDTO object representing the deleted mentor
     */
    MentorDTO deleteMentorById(Integer id);
}
