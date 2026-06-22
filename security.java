package com.example.demo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Security {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long securityId;

    @Column
    private String securityName;

    @Column
    private String category;

    @Column
    private LocalDate purchaseDate;

    @Column
    private Double purchasePrice;

    @Column
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "portfolio_id")
    private Portfolio portfolio;

    public Security(Long securityId, String securityName, String category,
                    LocalDate purchaseDate, Double purchasePrice,
                    Integer quantity, Portfolio portfolio) {
        this.securityId = securityId;
        this.securityName = securityName;
        this.category = category;
        this.purchaseDate = purchaseDate;
        this.purchasePrice = purchasePrice;
        this.quantity = quantity;
        this.portfolio = portfolio;
    }

    public Security() {}

    // Getters and Setters
}
