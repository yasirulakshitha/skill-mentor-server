package com.skillmentor.root.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.Instant;

@Data
@Entity
@Table(name = "session")
public class LiteSessionEntity {

    @Id
    @Column(name = "session_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sessionId;
    @Column(name = "student_id")
    private Integer studentId;
    @Column(name = "class_room_id")
    private Integer classRoomId;
    @Column(name = "mentor_id")
    private Integer mentorId;
    @Column(name = "topic")
    private String topic;
    @Column(name = "start_time")
    private Instant startTime;
    @Column(name = "end_time")
    private Instant endTime;

    public LiteSessionEntity(Integer sessionId, Integer studentId, Integer classRoomId, Integer mentorId, Instant startTime, Instant endTime, String topic) {
        this.sessionId = sessionId;
        this.studentId = studentId;
        this.classRoomId = classRoomId;
        this.mentorId = mentorId;
        this.startTime = startTime;
        this.endTime = endTime;
        this.topic = topic;
    }

    public LiteSessionEntity(){}


}