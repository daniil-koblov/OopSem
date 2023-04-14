package OopSem1;

public class Product {
    
    private String name;

    public void setName(String name){
        this.name = name;
    }

    private Integer cost;

    public void setCost(Integer cost){
        this.cost = cost;
    }

    public Product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }

    // @Override
    // public String toString() {
    //     return super.toString("%s, %d");
    // }
}
