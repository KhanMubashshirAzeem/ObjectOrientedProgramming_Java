package MethodOverloading;

public class MethodOverLoading {
    // Driver code
    public static void main(String args[])
    {
        Sum s = new Sum();
        System.out.println("Method with two int parameter "+s.sum(10, 20));
        System.out.println("Method with three int parameter "+s.sum(10, 20, 30));
        System.out.println("Method with two double parameter "+s.sum(10.5, 20.5));
    }
}

// Java program to demonstrate working of method
// overloading in Java

// According to the parameter and name of the method.
// that method will execute in main body.

class Sum {
    // Overloaded sum(). This sum takes two int parameters
    public int sum(int x, int y) { return (x + y); }

    // Overloaded sum(). This sum takes three int parameters
    public int sum(int x, int y, int z)
    {
        return (x + y + z);
    }

    // Overloaded sum(). This sum takes two double
    // parameters
    public double sum(double x, double y)
    {
        return (x + y);
    }
}


