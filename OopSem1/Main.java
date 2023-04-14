package OopSem1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new Product("cheese",300))
                        .addProduct(new Product("water", 10))
                .addProduct(new Product("wine", 330));
                .addProduct(new Yogurt("Danone", 300, "sweet"));
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }

    }
}