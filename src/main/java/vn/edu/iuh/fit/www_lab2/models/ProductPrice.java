package vn.edu.iuh.fit.www_lab2.models;

import java.time.LocalDate;

public class ProductPrice {
    private LocalDate price_data_time;
    private String note;
    private  double price;

    public LocalDate getPrice_data_time() {
        return price_data_time;
    }

    public void setPrice_data_time(LocalDate price_data_time) {
        this.price_data_time = price_data_time;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ProductPrice(LocalDate price_data_time, String note, double price) {
        this.price_data_time = price_data_time;
        this.note = note;
        this.price = price;
    }

    public ProductPrice() {
    }

    @Override
    public String toString() {
        return "ProductPrice{" +
                "price_data_time=" + price_data_time +
                ", note='" + note + '\'' +
                ", price=" + price +
                '}';
    }
}
