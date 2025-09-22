package com.skillmentor.root.dto;


import com.fasterxml.jackson.annotation.JsonProperty;



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


    public ClassRoomDTO() {
    }

    public ClassRoomDTO(Integer classRoomId, String name, Double sessionFee, Integer enrolledStudentCount) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.sessionFee = sessionFee;
        this.enrolledStudentCount = enrolledStudentCount;

    }

}

