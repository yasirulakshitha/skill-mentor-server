package com.skillmentor.root.dto;

import lombok.Data;

import java.time.Instant;


@Data
public class SessionLiteDTO {
    private Integer sessionId;
    private Integer studentId;
    private Integer classRoomId;
    private Integer mentorId;
    private String topic;
    private Instant startTime;
    private Instant endTime;

    public SessionLiteDTO(Integer sessionId, Integer studentId, Integer classRoomId, Integer mentorId, Instant startTime, Instant endTime, String topic) {
        this.sessionId = sessionId;
        this.studentId = studentId;
        this.classRoomId = classRoomId;
        this.mentorId = mentorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.topic = topic;
    }

    public SessionLiteDTO(){}


}