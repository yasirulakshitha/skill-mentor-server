package com.skillmentor.root.dto;

import lombok.Data;

import java.time.Instant;


@Data
public class SessionDTO {
    private Integer sessionId;
    private StudentDTO studentDTO;
    private ClassRoomDTO classRoomDTO;
    private MentorDTO mentorDTO;
    private String topic;
    private Instant startTime;
    private Instant endTime;

    public SessionDTO(Integer sessionId, StudentDTO studentDTO, ClassRoomDTO classRoomDTO, MentorDTO mentorDTO, Instant startTime, Instant endTime, String topic) {
        this.sessionId = sessionId;
        this.studentDTO = studentDTO;
        this.classRoomDTO = classRoomDTO;
        this.mentorDTO = mentorDTO;
        this.startTime = startTime;
        this.endTime = endTime;
        this.topic = topic;
    }

    public SessionDTO(){

    }

}