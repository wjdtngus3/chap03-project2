package com.ohgiraffers.section03.remix;

public class ItemDTO {
    private int code;
    private String name;
    private int price;
    private int categoryCode;

    public ItemDTO() {
    }

    public ItemDTO(int code, String name, int price, int categoryCode) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.categoryCode = categoryCode;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(int categoryCode) {
        this.categoryCode = categoryCode;
    }

    @Override
    public String toString() {
        return "ItemDTO{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", categoryCode=" + categoryCode +
                '}';
    }
}
