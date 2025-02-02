package com.phawtrading.trading_backend.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;




@Entity
@Table(name = "loss_carryforward")

public class LossCarryforward {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "used_amount", nullable = false)
    private Double usedAmount;

    @Column(name = "remaining_amount", nullable = false)
    private Double remainingAmount;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "asset_class", nullable = false)
    private String assetClass;

    // Getter und Setter Methoden macht lombok...

}
