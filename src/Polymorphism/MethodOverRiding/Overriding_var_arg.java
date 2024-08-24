package Polymorphism.MethodOverRiding;

// If we try to override var arg variables method with normal variable methods then it is called Overloading not Overriding.

public class Overriding_var_arg {
    public void m1(int... a) {
        System.out.println("Parent...");
    }

    public static void main(String[] args) {
        Overriding_var_arg parent = new Overriding_var_arg();  // the output is based on runtime object
        parent.m1();                                           // output: Parent....

        subClass1 child = new subClass1();
        child.m1();                                      // output: Child...

        Overriding_var_arg parent1 = new subClass1();
        parent1.m1();                                    // output: Child...

    }
}

class subClass1 extends Overriding_var_arg {
    @Override
    public void m1(int... a) {
        System.out.println("Child...");
    }
}