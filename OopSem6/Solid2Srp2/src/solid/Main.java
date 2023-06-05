package solid;

import solid.srp.models.Input;
import solid.srp.models.Order;
import solid.srp.models.SaverToJson;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Input input = new Input();
        Order order = input.inputFromConsole();
        SaverToJson saver = new SaverToJson("order.json", order);
        saver.save();
    }
}
