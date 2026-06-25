class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Student extends Person {
    final int studentId;
    double gpa;

    Student(String name, int age, int studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String toString() {
        return super.toString() + ", Student ID: " + studentId + ", GPA: " + gpa;
    }
}

class GradStudent extends Student {
    String thesis;

    GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa);
        this.thesis = thesis;
    }

    public String toString() {
        return super.toString() + ", Thesis: " + thesis;
    }
}

public class UniversityHierarchy {
    public static void main(String[] args) {

        Person p = new Person("Alice", 40);
        Student s = new Student("Bob", 20, 1001, 3.5);
        GradStudent g = new GradStudent("Carol", 25, 2001, 3.9, "AI in Healthcare");

        System.out.println("--- Person ---");
        System.out.println(p);

        System.out.println("\n--- Student ---");
        System.out.println(s);

        System.out.println("\n--- GradStudent ---");
        System.out.println(g);

        System.out.println("\n--- IS-A Checks ---");
        System.out.println("GradStudent IS-A Student: " + (g instanceof Student));
        System.out.println("GradStudent IS-A Person:  " + (g instanceof Person));
        System.out.println("Student IS-A Person:      " + (s instanceof Person));
    }
}