package com.skillmentor.root.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "mentor")
@Data
public class MentorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mentor_id")
    private Integer mentorId;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;

    @Column(name = "email")
    private String email;

    @Column(name = "title")
    private String title;

    @Column(name = "profession")
    private String profession;

    @Column(name = "subject")
    private String subject;

    @Column(name = "qualification")
    private String qualification;

    @ManyToMany(mappedBy = "mentorEntities", fetch = FetchType.EAGER)
    private List<ClassRoomEntity> classRoomEntities = new ArrayList<>();

    public MentorEntity() {}

    public MentorEntity(Integer mentorId, String firstName, String lastName, String address, String email,
                        String title, String profession, String subject, String qualification,List<ClassRoomEntity> classRoomEntities) {
        this.mentorId = mentorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.title = title;
        this.profession = profession;
        this.subject = subject;
        this.qualification = qualification;
        this.classRoomEntities = classRoomEntities;
    }




}