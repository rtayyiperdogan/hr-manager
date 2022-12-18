package com.open.hrmanager.models;

import com.open.hrmanager.models.enums.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String phoneNumber;
    private String address;
    private String salary;
    private String startDate;
    private String endDate;
    private boolean isActive;
    @ManyToOne(fetch = FetchType.LAZY)
    private Department department;
    @Enumerated(EnumType.ORDINAL)
    private Role role;

}