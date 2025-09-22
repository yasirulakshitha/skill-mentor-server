package com.skillmentor.root.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

import lombok.Data;


import java.util.ArrayList;
import java.util.List;



@Data
@Entity
@Table(name = "classroom")
public class ClassRoomEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer classRoomId;
    @Column(name = "title")
    private String title;
    @Column(name = "session_fee")
    private Double sessionFee;
    @Column(name = "enrolled_student_count")
    private Integer enrolledStudentCount;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name="mentor_classroom",
            joinColumns = @JoinColumn(name= "class_room_id"),
            inverseJoinColumns = @JoinColumn(name="mentor_id")
    )
    private List<MentorEntity> mentorEntities = new ArrayList<>();

    public ClassRoomEntity() {
    }

    public ClassRoomEntity(Integer classRoomId, String name, Double sessionFee, Integer enrolledStudentCount, List<MentorEntity> mentorEntities) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.sessionFee = sessionFee;
        this.enrolledStudentCount = enrolledStudentCount;
        this.mentorEntities = mentorEntities;

    }



}