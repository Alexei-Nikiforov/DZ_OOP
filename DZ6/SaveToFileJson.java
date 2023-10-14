package DZ6;

import java.io.FileWriter;
import java.io.IOException;

public abstract class SaveToFileJson {

    public static void saveToJson(Order order) {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)) {
            Client client = order.getClient();
            Product product = order.getProduct();
            writer.write("{\n");
            writer.write("\"clientName\":\""+ client.getClientName() + "\",\n");
            writer.write("\"product\":\""+product.getProduct()+"\",\n");
            writer.write("\"qnt\":"+product.getQnt()+",\n");
            writer.write("\"price\":"+product.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
