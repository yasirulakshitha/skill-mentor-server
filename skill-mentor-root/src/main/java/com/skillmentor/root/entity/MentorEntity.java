package com.skillmentor.root.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "profession")
    private String profession;

    @Column(name = "session_fee")
    private Double sessionFee;

    @Column(name = "subject")
    private String subject;

    @Column(name = "qualification")
    private String qualification;

    @OneToMany(mappedBy = "mentorEntity", fetch = FetchType.EAGER)
    private List<SessionEntity> sessionEntityList = new ArrayList<>();

    public MentorEntity() {}

    public MentorEntity(Integer mentorId, String firstName, String lastName, String address, String email,Double sessionFee,
                        String title, String profession, String subject, String qualification, List<SessionEntity> sessionEntityList,String phoneNumber){
        this.mentorId = mentorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.sessionFee = sessionFee;
        this.title = title;
        this.profession = profession;
        this.subject = subject;
        this.qualification = qualification;
        this.sessionEntityList = sessionEntityList;
        this.phoneNumber = phoneNumber;
    }


}