package com.skillmentor.root.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ClassRoomDTO {
    private Integer classRoomId;
    private String title;
    private Integer enrolledStudentCount;
    @JsonProperty("mentor")
    private MentorDTO mentorDTO;

    public ClassRoomDTO() {
    }

    public ClassRoomDTO(Integer classRoomId, String name, Integer enrolledStudentCount, MentorDTO mentorDTO) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.enrolledStudentCount = enrolledStudentCount;
        this.mentorDTO = mentorDTO;

    }



}