package com.skillmentor.root.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class MentorDTO {
    private Integer mentorId;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String title;
    private String profession;
    private String subject;
    private String qualification;
    private List<ClassRoomDTO> classRoomDTOList;
    private List<Integer> classRoomIds = new ArrayList<>();

    public MentorDTO() {
    }

    public MentorDTO(Integer mentorId, String firstName, String lastName, String address, String email,
                     String title, String profession, String subject, String qualification,List<ClassRoomDTO> classRoomDTOList, List<Integer> classRoomIds) {
        this.mentorId = mentorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.title = title;
        this.profession = profession;
        this.subject = subject;
        this.qualification = qualification;
        this.classRoomDTOList = classRoomDTOList;
        this.classRoomIds = classRoomIds;
    }

}
