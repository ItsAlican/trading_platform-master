package com.phawtrading.trading_backend.model;

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
@Table(name = "portfolio_position")
@Data
public class PortfolioPosition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolio;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(name = "quantity", nullable = false)
    private Double quantity;

    @Column(name = "average_purchase_price", nullable = false)
    private Double averagePurchasePrice;

    // Getter und Setter Methoden macht lombok...

}
