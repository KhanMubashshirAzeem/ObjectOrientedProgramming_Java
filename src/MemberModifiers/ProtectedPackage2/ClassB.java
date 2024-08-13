package MemberModifiers.ProtectedPackage2;

import MemberModifiers.ProtectedPackage1.ClassA;

public class ClassB extends ClassA {
    public static void main(String[] args) {

        // Child object Child reference can access the protected method from different class.
        ClassB classB = new ClassB();
        classB.m1();

//        // We can't make parent object outside the package
//        ClassA classA11 = new ClassA();
//        classA11.m1();

    }
}
