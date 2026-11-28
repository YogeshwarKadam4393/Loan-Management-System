package com.lms.project.dto.response;

import lombok.Data;

@Data
public class BranchSummary {

    private Long id;

    private String branchCode;

    private String branchName;

    private String ifscCode;

}