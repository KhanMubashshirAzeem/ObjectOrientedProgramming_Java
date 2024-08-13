package MemberModifiers.PrivatePackage2;

class A {

    // Variables should be always private (Recommended)
    private int carWheels = 4;

    public void m1() {
        System.out.println("Public Method");
    }

    private void m2() {
        System.out.println("Private Method");
    }
}

public class PrivateClass2 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

    // We cant access this method because this is private method.
    // Error : java: m2() has private access in MemberModifiers.PrivatePackage2.A
    //                a.m2();


    }
}
