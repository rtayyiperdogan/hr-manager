package com.open.hrmanager.models.dtos.create;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CreateEmployeeRequest {
    @NotNull
    @NotBlank
    private String name;
    @NotNull
    @NotBlank
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String salary;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean isActive;
    private UUID roleId;
    @NotNull
    private UUID departmentId;
}
