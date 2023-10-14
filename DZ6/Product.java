package DZ6;

public class Product {

    private String product;
    private int qnt;
    private double price;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public int getQnt() {
        return qnt;
    }

    public void setQnt(int qnt) {
        this.qnt = qnt;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String product) {
        this(product, 1, 10.0);
    }
    
    public Product(String product, double price) {
        this(product, 1, price);
    }

    public Product(String product, int qnt, double price) {
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }    
}
