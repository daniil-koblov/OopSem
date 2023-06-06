package solid.lsp;

public class OrderBonus extends AbstractOrder{

    public OrderBonus(int qnt, int price) {
        super(qnt, price);
    }

    @Override
    public int getAmount() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Количество = %d, Цена с учетом скидки = %d", qnt, price);
    }
}
