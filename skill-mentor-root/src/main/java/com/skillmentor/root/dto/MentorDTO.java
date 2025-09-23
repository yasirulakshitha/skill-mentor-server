package com.skillmentor.root.dto;

import lombok.Data;

@Data
public class MentorDTO {
    private Integer mentorId;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String title;
    private String profession;
    private String subject;
    private String phoneNumber;
    private String qualification;
    private Integer classRoomId;

    public MentorDTO() {}

    public MentorDTO(Integer mentorId, String firstName, String lastName, String address, String email,
                     String title, String profession, String subject, String qualification, Integer classRoomId, String phoneNumber) {
        this.mentorId = mentorId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.title = title;
        this.profession = profession;
        this.subject = subject;
        this.qualification = qualification;
        this.classRoomId = classRoomId;
        this.phoneNumber = phoneNumber;
    }
}
