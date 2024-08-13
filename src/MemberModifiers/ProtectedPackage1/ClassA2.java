package MemberModifiers.ProtectedPackage1;

public class ClassA2 extends ClassA {
    public static void main(String[] args) {
        // After Child extends parent Class then Child can access the Parent protected method.
        ClassA2 classA2 = new ClassA2();
        classA2.m1();

        ClassA classA = new ClassA2(); // Parent object Parent child reference can access with in a same package
        classA.m1();

    }

}
