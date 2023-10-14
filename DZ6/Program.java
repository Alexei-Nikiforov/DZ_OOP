package DZ6;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

        Order order = new Order();
        SaveToFileJson.saveToJson(order);
        System.out.println("Информация по заказу успешно сохранена в файл.");

    }

}
