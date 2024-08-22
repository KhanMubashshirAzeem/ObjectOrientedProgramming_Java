package MethodOverRiding;

class parentClass {
    public void property() {
        System.out.println("Cash + Land + Gold");
    }

    public void marry() {
        System.out.println("Parent method: Male / Female");
    }
}

class childClass extends parentClass {
    public void marry() {
        System.out.println("Child Method: Man / Women");
    }
}


public class Example1 {
    public static void main(String[] args) {

        // In polymorphism output is depend on runtime object
        // not on runtime reference

        parentClass pC = new parentClass();
        pC.marry();
        pC.property();

        childClass cC = new childClass();
        cC.marry();
        cC.property();

        parentClass pC1 = new childClass();
        cC.marry();       // Here class method will get the chance

    }
}




