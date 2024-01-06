import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String designation;

    Employee(int empId, String empName, String designation) {
        this.empId = empId;
        this.empName = empName;
        this.designation = designation;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Designation: " + designation);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for employee " + (i + 1));
            System.out.print("Employee ID: ");
            int empId = sc.nextInt();
            sc.nextLine();
            System.out.print("Employee Name: ");
            String empName = sc.nextLine();
            System.out.print("Designation: ");
            String designation = sc.nextLine();

            employees[i] = new Employee(empId, empName, designation);
        }

        System.out.println("\nEmployee Details:");
        for (Employee employee : employees) {
            employee.displayEmployee();
            System.out.println();
        }
        sc.close();
    }
}
