package MemberModifiers.ProtectedPackage1;

import MemberModifiers.ProtectedPackage2.ClassB;

public class ClassA {
    protected void m1() {
        System.out.println("A Class Protected method");

    }
}

class ChildClass extends ClassA{
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass(); // Child object Child reference can access.
        childClass.m1();

        ClassA classA = new ClassA();  // Parent object Parent reference can also access.
        classA.m1();

        ClassA classA1 = new ChildClass();  // Parent object Child reference can also access.
        classA1.m1();

//        ChildClass childClass1 = new ClassA();  // but Child object Parent reference can't access.
//        childClass1.m1();

    }
}


