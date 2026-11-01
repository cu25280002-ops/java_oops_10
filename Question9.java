import java.util.LinkedList;
import java.util.Queue;

class Patient {
    private int id;
    private String name;

    public Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println("Patient ID: " + id + " | Name: " + name);
    }
}

public class Question9 {
    private Queue<Patient> patientQueue = new LinkedList<>();

    public void addPatient(Patient p) {
        patientQueue.add(p);
        System.out.print("Added Patient: ");
        p.display();
    }

    public void servePatient() {
        if (!patientQueue.isEmpty()) {
            Patient served = patientQueue.poll();
            System.out.print("Serving Patient: ");
            served.display();
        } else {
            System.out.println("No patients in line.");
        }
    }

    public void displayQueue() {
        System.out.println("\nCurrent Patient Queue (FIFO):");
        if (patientQueue.isEmpty()) {
            System.out.println("Queue is empty.");
        } else {
            for (Patient p : patientQueue) {
                p.display();
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Question 9: Queue Interface with LinkedList ---");
        Question9 hospital = new Question9();

        hospital.addPatient(new Patient(101, "John Smith"));
        hospital.addPatient(new Patient(102, "Emma Watson"));
        hospital.addPatient(new Patient(103, "Robert Downey"));

        hospital.displayQueue();

        System.out.println("\nServing next patient...");
        hospital.servePatient();

        hospital.displayQueue();
    }
}
