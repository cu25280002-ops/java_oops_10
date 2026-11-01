import java.util.TreeSet;

class Product implements Comparable<Product> {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public void display() {
        System.out.println("Product ID: " + id + " | Name: " + name + " | Price: $" + price);
    }

    @Override
    public int compareTo(Product other) {
        return Double.compare(this.price, other.price);
    }
}

public class Question4 {
    public static void main(String[] args) {
        System.out.println("--- Question 4: TreeSet Sorting ---");
        TreeSet<Product> productSet = new TreeSet<>();

        productSet.add(new Product(1, "Laptop", 899.99));
        productSet.add(new Product(2, "Mouse", 25.50));
        productSet.add(new Product(3, "Keyboard", 45.00));
        productSet.add(new Product(4, "Monitor", 220.00));
        productSet.add(new Product(5, "Headphones", 75.25));

        System.out.println("\nProducts sorted by price (ascending):");
        for (Product p : productSet) {
            p.display();
        }
    }
}
