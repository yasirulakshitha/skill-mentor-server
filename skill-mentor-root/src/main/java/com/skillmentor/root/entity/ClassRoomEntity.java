package com.skillmentor.root.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

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


    public ClassRoomEntity() {
    }

    public ClassRoomEntity(Integer classRoomId, String name, Double sessionFee, Integer enrolledStudentCount, Integer mentorId) {
        this.classRoomId = classRoomId;
        this.title = name;
        this.sessionFee = sessionFee;
        this.enrolledStudentCount = enrolledStudentCount;

    }

}