import java.util.HashMap;
import java.util.Map;

class StudentInfo {
    private int rollNo;
    private String name;

    public StudentInfo(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public int getRollNo() { return rollNo; }
    public String getName() { return name; }

    public void display() {
        System.out.println("Roll No: " + rollNo + " | Name: " + name);
    }
}

public class Question5 {
    private Map<Integer, String> studentMap = new HashMap<>();

    public void addStudent(StudentInfo s) {
        studentMap.put(s.getRollNo(), s.getName());
    }

    public void removeStudent(int rollNo) {
        if (studentMap.containsKey(rollNo)) {
            String removedName = studentMap.remove(rollNo);
            System.out.println("Removed Student: Roll No " + rollNo + " (" + removedName + ")");
        } else {
            System.out.println("Roll No " + rollNo + " not found.");
        }
    }

    public void displayAll() {
        System.out.println("\nAll Students in HashMap:");
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Roll No: " + entry.getKey() + " | Name: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Question 5: HashMap Key-Value Pairs ---");
        Question5 demo = new Question5();

        demo.addStudent(new StudentInfo(101, "Alice"));
        demo.addStudent(new StudentInfo(102, "Bob"));
        demo.addStudent(new StudentInfo(103, "Charlie"));

        demo.displayAll();

        System.out.println("\nRemoving Roll No 102...");
        demo.removeStudent(102);

        demo.displayAll();
    }
}
