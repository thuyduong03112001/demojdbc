package model;

import java.sql.Date;


public class Product {
    private String id;
    private String name;
    private String cat_Id;
    private String image;
    private double price;
    private int quantity;
    private String describe;
    private String status;
    private Date adddate;

    public Product() {
    }

    public Product(String id, String name, String cat_Id, String image, double price, int quantity, String describe, String status, Date adddate) {
        this.id = id;
        this.name = name;
        this.cat_Id = cat_Id;
        this.image = image;
        this.price = price;
        this.quantity = quantity;
        this.describe = describe;
        this.status = status;
        this.adddate = adddate;
    }

    public String getCat_Id() {
        return cat_Id;
    }

    public void setCat_Id(String cat_Id) {
        this.cat_Id = cat_Id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatId() {
        return cat_Id;
    }

    public void setCatId(String cat_Id) {
        this.cat_Id = cat_Id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getAdddate() {
        return adddate;
    }

    public void setAdddate(Date adddate) {
        this.adddate = adddate;
    }
}
