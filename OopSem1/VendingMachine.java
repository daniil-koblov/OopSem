package OopSem1;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    List<Product> list = new ArrayList<>();
    public VendingMachine addProduct(Product product){
        list.add(product);
        return this;

    }

    public List<Product> getList() {
        return list;
    }
}
