// // If a class contain at least one abstract method then its compulsory to make the class as abstract
//
//abstract class AbstractClass {
//    public static void m1(){}
//    public static void m2(){}
//    public abstract void m3();
//
//    public static void main(String[] args) {
//        System.out.println("Abstract class with 0 abstract method");
//    }
//}


// // We can declare class as Abstract if there is 0 abstract method
//
//abstract class AbstractClass {
//    public static void m1(){}
//    public static void m2(){}
//    public static void m3(){}
//
//    public static void main(String[] args) {
//        System.out.println("Abstract class with 0 abstract method");
//    }
//}

// When we need a compulsory implementation then we use abstract
// Child class is responsible to provide for implementation for every abstract method

abstract class AbstractClass {
    public abstract int noOfWheels();
}

class Bus extends AbstractClass {
    public int noOfWheels() {
        return 6;
    }
}

class Bike extends AbstractClass {
    public int noOfWheels() {
        return 2;
    }
}

class Test {
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.noOfWheels();

        Bike bike = new Bike();
        bike.noOfWheels();
    }
}