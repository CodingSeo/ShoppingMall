package com.dyago.DiegoShopping.domains.products.entities;

import com.dyago.DiegoShopping.commons.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Category extends BaseEntity {
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "category")
    private List<Product> products = new ArrayList<>();

    private String name;

    public void addProduct(Product product)
    {
        this.products.add(product);
        product.setCategory(this);
    }
}
