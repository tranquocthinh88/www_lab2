package vn.edu.iuh.fit.www_lab2.models;

import java.time.LocalDateTime;

public class Order {
    private long id;
    private LocalDateTime orderDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;}

    public Order(long id, LocalDateTime orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                '}';
    }
}
