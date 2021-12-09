package com.dyago.DiegoShopping.domains.products.entities;

import com.dyago.DiegoShopping.commons.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
public class Product extends BaseEntity {
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_no")
    @Setter
    private Category category;
    private Long price;
    private Boolean isSoldOut;
    private Boolean isDiscount;
    private Boolean isDisplay;
    private String discountRate;
}
