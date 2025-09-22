package com.skillmentor.root.dto;


import lombok.Data;

@Data
public class ClassRoomDTO {
    private Integer classRoomId;
    private String title;
    private Double sessionFee;
    private Integer enrolledStudentCount;
    private MentorDTO mentorDTO;


    public ClassRoomDTO() {
    }

    public ClassRoomDTO(Integer classRoomId, String name, Double sessionFee, Integer enrolledStudentCount, MentorDTO mentorId) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.sessionFee = sessionFee;
        this.enrolledStudentCount = enrolledStudentCount;
        this.mentorDTO = mentorId;

    }

    public MentorDTO getMentor() {
        return mentorDTO;
    }

    public void setMentor(MentorDTO mentorId) {
        this.mentorDTO = mentorId;
    }

}

