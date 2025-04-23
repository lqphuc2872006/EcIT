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
@Table(name = "Tokens")
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tokensID", nullable = false)
    private Integer id;

    @Nationalized
    @Column(name = "token", nullable = false)
    private String token;

    @ColumnDefault("getdate()")
    @Column(name = "createAt")
    private Instant createAt;

    @Column(name = "ExporeAt")
    private Instant exporeAt;

    @ColumnDefault("1")
    @Column(name = "isActive")
    private Boolean isActive;

}