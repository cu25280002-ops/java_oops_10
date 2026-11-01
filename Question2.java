import java.util.LinkedList;

class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Employee extends Person {
    private int empId;
    private String department;

    public Employee(String name, int age, int empId, String department) {
        super(name, age);
        this.empId = empId;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Age: " + age + " | Dept: " + department);
    }
}

public class Question2 {
    private LinkedList<Employee> employees = new LinkedList<>();

    public void addEmployee(Employee emp) {
        employees.add(emp);
    }

    public void displayAll() {
        for (Employee emp : employees) {
            emp.display();
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Employee emp : employees) {
            if (emp.getName().equalsIgnoreCase(name)) {
                System.out.println("Employee Found:");
                emp.display();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Employee with name '" + name + "' not found.");
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Question 2: LinkedList & Inheritance ---");
        Question2 manager = new Question2();

        manager.addEmployee(new Employee("John Doe", 30, 101, "IT"));
        manager.addEmployee(new Employee("Jane Smith", 28, 102, "HR"));
        manager.addEmployee(new Employee("Mike Johnson", 35, 103, "Finance"));

        System.out.println("\nAll Employees:");
        manager.displayAll();

        System.out.println("\nSearching for 'Jane Smith':");
        manager.searchByName("Jane Smith");

        System.out.println("\nSearching for 'Alex':");
        manager.searchByName("Alex");
    }
}
