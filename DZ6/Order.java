package DZ6;

public class Order {

    private Client client;
    private Product product;

    public Order(){
        inputFromConsole();
    }

    public Order(Client client, Product product) {
        this.client = client;
        this.product = product;
    }

    public Client getClient() {
        return client;
    }

    public Product getProduct() {
        return product;
    }

    public void inputFromConsole(){
        client = WorkingFromConsoles.clientConsole(client);
        product = WorkingFromConsoles.productConsole(product);
    }
}
