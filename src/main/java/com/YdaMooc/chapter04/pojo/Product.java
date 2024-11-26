package com.YdaMooc.chapter04.pojo;

public class Product {
    private int id;
    private String goodsName;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", goodsName='" + goodsName + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
