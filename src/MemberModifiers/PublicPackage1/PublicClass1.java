package MemberModifiers.PublicPackage1;

public class PublicClass1 {
    public static void main(String[] args) {

    }
    public void method1(){
        System.out.println("Public Class 1 of Package 1");
    }
}

// If the above class is not public we cant access it from here also
// Error: java: MemberModifiersPackage1.PublicClass1 is not public in
// MemberModifiersPackage1; cannot be accessed from outside package

class Class1{
    public static void main(String[] args) {
        PublicClass1 class1 = new PublicClass1();
        class1.method1();
    }
}

// // But if the class is not "Public"
//// then we can't access the methods of that class from different package of class
//public class PublicClass1 {
//    public static void main(String[] args) {
//
//    }
//    public void method1(){
//        System.out.println("Public Class 1 of Package 1");
//
//    }
//}
