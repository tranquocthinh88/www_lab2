package vn.edu.iuh.fit.www_lab2.models;

public class ProductImage {
    private long id;
    private String alternative;
    private String path;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "id=" + id +
                ", alternative='" + alternative + '\'' +
                ", path='" + path + '\'' +
                '}';
    }

    public ProductImage(long id, String alternative, String path) {
        this.id = id;
        this.alternative = alternative;
        this.path = path;
    }

    public ProductImage() {
    }
}
