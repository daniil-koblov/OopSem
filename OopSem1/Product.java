package OopSem1;

public class Product {
    public void setName(String name){
        this.name = name;
    }
    private String name;

    public void setCost(Integer cost){
        this.cost = cost;
    }

    private Integer cost;

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString("%s, %d");
    }
}
