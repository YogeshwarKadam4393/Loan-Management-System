package com.lms.project.dto.response;

import java.time.LocalDateTime;
import java.util.Set;

import com.lms.project.utils.Gender;
import com.lms.project.utils.RoleType;

import lombok.Data;

@Data
public class UserResponse {

    private Long id;

    private String customerCode;

    private String firstName;

    private String middleName;

    private String lastName;

    private String email;

    private String mobileNumber;

    private String dateOfBirth;

    private Gender gender;

    private String profilePhoto;

    private Boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Set<RoleType> roles;

    private BranchSummary branch;

    private AddressResponse address;

}