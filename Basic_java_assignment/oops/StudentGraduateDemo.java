// Base class: Student
class Student {
    String name = "Nayan Awasthi";
    int rollNumber = 101;
    double marks = 85.5;

    // Display student details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }
}

// Derived class: GraduateStudent (Inheritance)
class GraduateStudent extends Student {
    String specialization = "Computer Science";

    // Method Overloading (Polymorphism)
    void displayInfo(String university) {
        super.displayInfo();
        System.out.println("Specialization: " + specialization);
        System.out.println("University: " + university);
    }
}

public class StudentGraduateDemo {
    public static void main(String[] args) {
        // Creating Student Object
        Student student = new Student();
        System.out.println("\nStudent Details:");
        student.displayInfo();

        // Creating GraduateStudent Object
        GraduateStudent gradStudent = new GraduateStudent();
        System.out.println("\nGraduate Student Details:");
        gradStudent.displayInfo("MIT");
    }
}
