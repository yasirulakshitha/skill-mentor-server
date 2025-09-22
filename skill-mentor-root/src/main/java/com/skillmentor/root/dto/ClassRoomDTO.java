package com.skillmentor.root.dto;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;


import lombok.Data;

@Data
public class ClassRoomDTO {
    @JsonProperty("id")
    private Integer classRoomId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("fee")
    private Double sessionFee;
    @JsonProperty("studentCount")
    private Integer enrolledStudentCount;

    @JsonProperty("mentors")
    private List<MentorDTO> mentorDTOList = new ArrayList<>();


    public ClassRoomDTO() {
    }

    public ClassRoomDTO(Integer classRoomId, String name, Double sessionFee, Integer enrolledStudentCount, List<MentorDTO> mentorDTOList) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.sessionFee = sessionFee;
        this.enrolledStudentCount = enrolledStudentCount;
        this.mentorDTOList = mentorDTOList;

    }

}

