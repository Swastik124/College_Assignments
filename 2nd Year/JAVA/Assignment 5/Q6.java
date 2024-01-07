// Creating a base class called "Person"
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Creating a derived class called "Employee" which extends the base class "Person"
class Employee extends Person {
    private String designation;
    private int salary;

    public Employee(String name, int age, String designation, int salary) {
        super(name, age);
        this.designation = designation;
        this.salary = salary;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}

// Main class
public class Q6 {
    public static void main(String[] args) {
        // Creating an object of the "Employee" class
        Employee employee = new Employee("John Doe", 30, "Software Engineer", 80000);

        // Displaying the information of the "Employee" object
        employee.displayInfo();
    }
}