package com.YdaMooc.chapter04.pojo;

import java.util.List;

public class Category {
    private int id;
    private String typename;
    private List<Product> productList;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", typename='" + typename + '\'' +
                ", productList=" + productList +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
