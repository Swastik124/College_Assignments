public class Student {
    static int n = 0;
    String name;
    int roll;
    Address address;

    public Student(String name, int roll, String city, int pin) {
        System.out.println("Creating student number " + ++n);
        this.name = name;
        this.roll = roll;
        this.address = new Address(city, pin);
    }

    public void displayStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll: " + roll);
        System.out.println("Address: " + address.city + ", " + address.pin);
    }

    class Address {
        String city;
        int pin;

        public Address(String city, int pin) {
            this.city = city;
            this.pin = pin;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John Doe", 1, "New York", 10001);
        Student s2 = new Student("Jane Doe", 2, "Chicago", 60616);
        Student s3 = new Student("Sam Wilson", 3, "Los Angeles", 90001);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}