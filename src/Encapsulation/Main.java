package Encapsulation;

// Java Program to demonstrate Java Encapsulation

// Student Class
class Student {
    // Encapsulating the name and age
    // only approachable and used using
    // methods defined
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// Driver Class
public class Main {
    // main function
    public static void main(String[] args) {
        // person object created
        Student student = new Student();
        student.setName("John");
        student.setAge(30);

        // Using methods to get the values from the
        // variables
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}

