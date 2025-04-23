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
@Table(name = "Users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "userID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "userName", nullable = false)
    private String userName;

    @Column(name = "pasword", nullable = false)
    private Integer pasword;

    @Nationalized
    @Column(name = "email")
    private String email;

    @ColumnDefault("getdate()")
    @Column(name = "createAt")
    private Instant createAt;

    @Column(name = "updateAt")
    private Instant updateAt;

    @ColumnDefault("1")
    @Column(name = "isActive")
    private Boolean isActive;

}