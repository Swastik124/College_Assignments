import java.util.Scanner;

public class Student {
    String sName;
    int sRollno;
    String sBranch;
    double CGPA;

    // Default constructor
    public Student() {
        sName = "Null";
        sRollno = 0;
        sBranch = "Null";
        CGPA = 0.0;
    }

    // Parameterized constructor
    public Student(String sName, int sRollno, String sBranch, double CGPA) {
        this.sName = sName;
        this.sRollno = sRollno;
        this.sBranch = sBranch;
        this.CGPA = CGPA;
    }

    public void displayStudentDetails() {
        System.out.println("Name: " + sName);
        System.out.println("Roll no: " + sRollno);
        System.out.println("Branch: " + sBranch);
        System.out.println("CGPA: " + CGPA);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter student details for student " + (i + 1));

            System.out.print("Enter name: ");
            String sName = scanner.next();

            System.out.print("Enter roll no: ");
            int sRollno = scanner.nextInt();

            System.out.print("Enter branch: ");
            String sBranch = scanner.next();

            System.out.print("Enter CGPA: ");
            double CGPA = scanner.nextDouble();

            Student student = new Student(sName, sRollno, sBranch, CGPA);
            students[i] = student;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent details for student " + (i + 1) + ":");
            students[i].displayStudentDetails();
        }

        scanner.close();
    }
}