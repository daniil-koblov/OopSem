package solid.srp.models;

import java.io.IOException;
import java.io.FileWriter;

public class SaverToJson implements SaveAs {

    private final Order order;

    String fileName = "order.json";

    public SaverToJson(String fileName, Order order) {
        this.order = order;
        this.fileName = fileName;
    }
    @Override
    public void save() {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
            writer.write("\"product\":\"" + order.getProduct() + "\",\n");
            writer.write("\"qnt\":" + order.getQnt() + ",\n");
            writer.write("\"price\":" + order.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
