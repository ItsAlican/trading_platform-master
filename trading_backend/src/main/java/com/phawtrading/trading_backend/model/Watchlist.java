package com.phawtrading.trading_backend.model;

import javax.persistence.*;

import java.util.Date;

import lombok.Data;

@Entity
@Table(name = "watchlist")
@Data
public class Watchlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(name = "added_at", nullable = false)
    private Date addedAt;

    // Getter und Setter Methoden macht lombok...

}
