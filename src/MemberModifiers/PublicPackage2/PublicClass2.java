package MemberModifiers.PublicPackage2;

import MemberModifiers.PublicPackage1.PublicClass1;

// If PublicClass1 is not public then we can't access its method from same package also
// Error: java: MemberModifiersPackage1.PublicClass1 is not public in
// MemberModifiersPackage1; cannot be accessed from outside package

public class PublicClass2 {
    public static void main(String[] args) {
        PublicClass1 class1 = new PublicClass1();
        class1.method1();
    }
}
