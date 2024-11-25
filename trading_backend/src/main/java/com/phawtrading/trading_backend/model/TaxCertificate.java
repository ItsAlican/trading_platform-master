package com.phawtrading.trading_backend.model;

import javax.persistence.*;

import java.util.Date;

import lombok.Data;

@Entity
@Table(name = "tax_certificate")
@Data
public class TaxCertificate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "year", nullable = false)
    private Integer year;

    @Column(name = "total_gain", nullable = false)
    private Double totalGain;

    @Column(name = "total_loss", nullable = false)
    private Double totalLoss;

    @Column(name = "total_taxable_income", nullable = false)
    private Double totalTaxableIncome;

    @Column(name = "total_tax_paid", nullable = false)
    private Double totalTaxPaid;

    @Column(name = "loss_offset", nullable = false)
    private Double lossOffset;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    // Getter und Setter Methoden macht lombok...

}
