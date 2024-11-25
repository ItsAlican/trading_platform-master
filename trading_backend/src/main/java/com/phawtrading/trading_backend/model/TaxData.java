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
@Table(name = "tax_data")
@Data
public class TaxData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "transaction_id", nullable = false)
    private Transaction transaction;

    @Column(name = "capital_gain", nullable = false)
    private Double capitalGain;

    @Column(name = "taxable_income", nullable = false)
    private Double taxableIncome;

    @Column(name = "tax_rate", nullable = false)
    private Double taxRate;

    @Column(name = "tax_amount", nullable = false)
    private Double taxAmount;

    @Column(name = "loss_offset", nullable = false)
    private Double lossOffset;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "asset_class", nullable = false)
    private String assetClass;

    // Getter und Setter Methoden macht lombok...

}
