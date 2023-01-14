package queue;

public class Customer {
    private String name;
    private int priority;

    public Customer(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", priority=" + priority +
                '}';
    }
}
