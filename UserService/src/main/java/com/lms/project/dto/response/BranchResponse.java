package com.lms.project.dto.response;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class BranchResponse {

    private Long id;

    private String branchCode;

    private String branchName;

    private String ifscCode;

    private String email;

    private String phoneNumber;

    private String managerName;

    private String addressLine1;

    private String addressLine2;

    private String city;

    private String state;

    private String country;

    private String pinCode;

    private Boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}