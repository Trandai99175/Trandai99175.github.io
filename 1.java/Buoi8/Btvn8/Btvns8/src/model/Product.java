package model;

public class Product {
    private int id;
    private String name;
    private String escription;
    private int quantity;
    private int price;

    public Product() {
    }

    public Product(int id, String name, String escription, int quantity, int price) {
        this.id = id;
        this.name = name;
        this.escription = escription;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEscription() {
        return escription;
    }

    public void setEscription(String escription) {
        this.escription = escription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", escription='" + escription + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
