import java.util.ArrayList;
import java.util.Iterator;

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Student Name: " + name);
    }
}

public class Question1 {
    public static void main(String[] args) {
        System.out.println("--- Question 1: ArrayList Demo ---");
        ArrayList<Student> studentList = new ArrayList<>();

        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");
        Student s3 = new Student("Charlie");
        Student s4 = new Student("David");

        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        System.out.println("\nInitial Student List:");
        for (Student s : studentList) {
            s.display();
        }

        System.out.println("\nRemoving Bob from the list...");
        studentList.remove(s2);

        System.out.println("\nUpdated Student List (Iterating using Iterator):");
        Iterator<Student> it = studentList.iterator();
        while (it.hasNext()) {
            it.next().display();
        }
    }
}
