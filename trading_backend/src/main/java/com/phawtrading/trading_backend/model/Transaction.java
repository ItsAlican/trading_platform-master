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

import lombok.Data;

@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(name = "transaction_type", nullable = false)
    private String transactionType;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "capital_gain", nullable = false)
    private Double capitalGain;

    @Column(name = "taxable_income", nullable = false)
    private Double taxableIncome;

    @Column(name = "taxable_loss", nullable = false)
    private Double taxableLoss;

    @Column(name = "tax_amount", nullable = false)
    private Double taxAmount;

    // Getter und Setter Methoden macht lombok...

}
