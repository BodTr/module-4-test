package com.spring.testmodule.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "items")
@Data
public class ItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private String status;

    @ManyToOne
    @JoinColumn(name = "itemType_id")
    private ItemTypeEntity itemType;
}
