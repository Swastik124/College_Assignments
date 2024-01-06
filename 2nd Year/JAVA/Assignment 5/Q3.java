class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void introduce() {
        System.out.println("Hello, my name is " + this.name + " and I am " + this.age + " years old.");
    }
}

class Student extends Person {
    String major;

    Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    void introduce() {
        super.introduce();
        System.out.println("My major is " + this.major + ".");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "Computer Science");
        student.introduce();
    }
}