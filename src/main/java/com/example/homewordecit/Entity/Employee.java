package com.example.homewordecit.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Nationalized;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employeesID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "codeEmployees")
    private String codeEmployees;

    @Nationalized
    @Column(name = "nameEmployees")
    private String nameEmployees;

    @Column(name = "phone")
    private Integer phone;

    @Column(name = "gender")
    private Boolean gender;

    @Nationalized
    @Column(name = "addressEmployees")
    private String addressEmployees;

    @ColumnDefault("getdate()")
    @Column(name = "createAt")
    private Instant createAt;

    @Column(name = "updateAt")
    private Instant updateAt;

    @ColumnDefault("1")
    @Column(name = "isActive")
    private Boolean isActive;

}