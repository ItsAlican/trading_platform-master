package com.phawtrading.trading_backend.model;

import javax.persistence.*;

import lombok.Data;

@Entity
@Table(name = "security")
@Data
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "symbol", nullable = false)
    private String symbol;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "security_type", nullable = false)
    private String securityType;

    @Column(name = "exchange", nullable = false)
    private String exchange;

    @Column(name = "current_price", nullable = false)
    private String currentPrice;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "asset_class", nullable = false)
    private String assetClass;

    // Getter und Setter Methoden macht lombok...

}
