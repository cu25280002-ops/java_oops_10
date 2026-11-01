import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() { return deptName; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptName);
    }

    @Override
    public String toString() {
        return deptName;
    }
}

class Teacher extends Department {
    private String teacherName;
    private String subject;

    public Teacher(String deptName, String teacherName, String subject) {
        super(deptName);
        this.teacherName = teacherName;
        this.subject = subject;
    }

    public void displayTeacherInfo() {
        System.out.println("  - Teacher: " + teacherName + " | Subject: " + subject);
    }
}

public class Question10 {
    private List<Department> departments = new ArrayList<>();
    private Map<Department, List<Teacher>> deptTeacherMap = new HashMap<>();

    public void addDepartment(Department dept) {
        if (!departments.contains(dept)) {
            departments.add(dept);
            deptTeacherMap.put(dept, new ArrayList<>());
        }
    }

    public void addTeacherToDepartment(Department dept, Teacher teacher) {
        addDepartment(dept);
        deptTeacherMap.get(dept).add(teacher);
    }

    public void displayAll() {
        System.out.println("\nDepartment and Teacher Structure:");
        for (Department dept : departments) {
            System.out.println("Department: " + dept.getDeptName());
            List<Teacher> teachers = deptTeacherMap.get(dept);
            if (teachers != null && !teachers.isEmpty()) {
                for (Teacher t : teachers) {
                    t.displayTeacherInfo();
                }
            } else {
                System.out.println("  (No teachers assigned)");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Question 10: Department & Teacher Management ---");
        Question10 college = new Question10();

        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");

        college.addTeacherToDepartment(cs, new Teacher("Computer Science", "Dr. Alan Turing", "Algorithms"));
        college.addTeacherToDepartment(cs, new Teacher("Computer Science", "Prof. Grace Hopper", "Compilers"));
        college.addTeacherToDepartment(math, new Teacher("Mathematics", "Dr. Carl Gauss", "Calculus"));

        college.displayAll();
    }
}
