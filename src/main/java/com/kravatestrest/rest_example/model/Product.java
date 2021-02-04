package com.kravatestrest.rest_example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "product")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Product {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "productIdSeq", sequenceName = "product_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "productIdSeq")
    private Long id;

    @Column(name = "productname")
    private String nameProduct;

    @Column(name = "priceproduct")
    private String priceProduct;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "dataofmanufacture")
    private String dataOfManufacture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(String priceProduct) {
        this.priceProduct = priceProduct;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDataOfManufacture() {
        return dataOfManufacture;
    }

    public void setDataOfManufacture(String dataOfManufacture) {
        this.dataOfManufacture = dataOfManufacture;
    }
}
