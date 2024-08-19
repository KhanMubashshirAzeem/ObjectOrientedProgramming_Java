package Inheritance.Single;

public class Main {
    public static void main(String[] args) {

        ChildClass childClass = new ChildClass();
        childClass.childFirstName();  // Child can access it methods.
        childClass.lastName();        // As well as parent method by using extends keyword.

        ParentClass parentClass = new ParentClass();
        parentClass.firstName();
//        parentClass.childFirstName();     // Parent cant access the child methods.
        parentClass.lastName();

        ParentClass parentChild = new ChildClass();  // A parent class reference can point to a child class object.
        parentChild.lastName();    // Only parent method can be called.

//        ChildClass childParent = new ParentClass();  // But a child class reference cannot point to a parent class object.

    }

}
