package OopSem2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    //public abstract String say();

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s: say %s, feed: %s", name, say(), feed());
    }
}
