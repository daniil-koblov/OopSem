package OopSem2;

public abstract class Animal {
    private String name;

    public abstract String say();

    @Override
    public String toString() {
        return String.format("Name %s: say %s", name, say());
    }
}
