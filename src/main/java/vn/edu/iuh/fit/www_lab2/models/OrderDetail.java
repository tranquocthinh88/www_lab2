package vn.edu.iuh.fit.www_lab2.models;

public class OrderDetail {
    private  String note;
    private double price;
    private double quantily;

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

    public double getQuantily() {
        return quantily;
    }

    public void setQuantily(double quantily) {
        this.quantily = quantily;
    }

    public OrderDetail(String note, double price, double quantily) {
        this.note = note;
        this.price = price;
        this.quantily = quantily;
    }

    public OrderDetail() {
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "note='" + note + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                '}';
    }
}
