import java.util.Vector;

class Customer {
    private int id;
    private String name;
    private String email;

    public Customer(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public void display() {
        System.out.println("Customer ID: " + id + " | Name: " + name + " | Email: " + email);
    }
}

public class Question7 {
    public static void main(String[] args) {
        System.out.println("--- Question 7: Vector & Encapsulation ---");
        Vector<Customer> customerVector = new Vector<>();

        Customer c1 = new Customer(1, "Alice Green", "alice@example.com");
        Customer c2 = new Customer(2, "Bob White", "bob@example.com");
        Customer c3 = new Customer(3, "Charlie Brown", "charlie@example.com");

        customerVector.add(c1);
        customerVector.add(c2);
        customerVector.add(c3);

        System.out.println("\nCustomer List in Vector:");
        for (Customer c : customerVector) {
            c.display();
        }
    }
}
