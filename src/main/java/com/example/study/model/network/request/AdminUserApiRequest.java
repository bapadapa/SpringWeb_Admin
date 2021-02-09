package com.example.study.model.network.request;

import com.example.study.model.enumclass.AdminRole;
import com.example.study.model.enumclass.AdminStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminUserApiRequest {
    private Long id;

    private String account;

    private String password;

    private AdminStatus status;

    private AdminRole role;

    private LocalDateTime lastLoginAt;

    private LocalDateTime passwordUpdatedAt;

    private Integer loginFailCount;

    private LocalDateTime registeredAt;

    private LocalDateTime unregisteredAt;



}
