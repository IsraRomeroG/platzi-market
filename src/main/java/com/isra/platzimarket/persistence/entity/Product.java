package com.isra.platzimarket.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Integer idProduct;

    @Column(name = "nombre")
    private String name;

    @Column(name = "id_categoria")
    private Integer idCategory;

    @Column(name = "codigo_barras")
    private String barCode;

    @Column(name = "precio_venta")
    private Double price;

    @Column(name = "cantidad_stock")
    private Integer stock;

    @Column(name = "estado")
    private boolean state;

    @ManyToOne
    @JoinColumn(name = "id_categoria", insertable = false, updatable = false)
    private Category category;

    @Override
    public String toString() {
        return "Product{" +
                "idProduct=" + idProduct +
                ", name='" + name + '\'' +
                ", idCategory=" + idCategory +
                ", barCode='" + barCode + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", state=" + state +
                ", category=" + category +
                '}';
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
}
