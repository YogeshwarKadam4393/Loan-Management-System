package com.lms.project.dto.response;

import java.time.LocalDateTime;

import com.lms.project.utils.ModuleType;
import com.lms.project.utils.PermissionType;

import lombok.Data;

@Data
public class PermissionResponse {

    private Long id;

    private PermissionType permissionName;

    private ModuleType moduleName;

    private String description;

    private Boolean active;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}