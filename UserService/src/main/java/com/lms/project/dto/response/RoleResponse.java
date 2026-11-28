package com.lms.project.dto.response;

import java.time.LocalDateTime;
import java.util.Set;

import com.lms.project.utils.RoleType;

import lombok.Data;

@Data
public class RoleResponse {

    private Long id;

    private RoleType roleName;

    private String description;

    private Boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private Set<PermissionResponse> permissions;

}