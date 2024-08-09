// ********* If class has at least  one abstract method then class should be abstract. ***


abstract class AbstractMethod {
    public abstract void m1();

    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}


// Getting error because we can't call method of abstract class

//abstract class Main {
//    public static void main(String[] args) {
//        Main m = new Main;
//    }
//}


// But if class is not abstract then the code run successfully

//class Main {
//    public static void main(String[] args) {
//        Main m = new Main;
//    }
//}


