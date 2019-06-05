package com.quintus.labs.grocerystore.model;

public class Order {
    String id;
    String orderId;
    String date;
    String total;
    String status;


    public Order() {
    }

    public Order(String id, String orderId, String date, String total, String status) {
        this.id = id;
        this.orderId = orderId;
        this.date = date;
        this.total = total;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
