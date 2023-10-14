package DZ6;

import java.util.Scanner;

public abstract class WorkingFromConsoles {

    private static String prompt(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextLine();
    }

    public static Client clientConsole(Client client){
        String clientName = prompt("Имя клиента: ");
        client = new Client(clientName);
        return client;
    }

    public static Product productConsole(Product product){
        String productName = prompt("Продукт: ");
        int productQnt = Integer.parseInt(prompt("Кол-во: "));
        double productPrice = Double.parseDouble(prompt("Цена: "));
        product = new Product(productName, productQnt, productPrice);
        return product;
    }
}
