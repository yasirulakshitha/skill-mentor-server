package com.skillmentor.root.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "classRoomEntity", fetch = FetchType.EAGER)
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