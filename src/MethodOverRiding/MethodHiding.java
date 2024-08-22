package MethodOverRiding;

public class MethodHiding {
    public static void a1() {
        System.out.println("Parent Method");
    }
}

class subClass extends MethodHiding {
    // This method is not overriding this is method hiding concept because parent and child method is static
    public static void a1() {
        System.out.println("Child Method");
    }

    public static void main(String[] args) {
        MethodHiding parent = new MethodHiding();   // The output is based on reference ty[e
        parent.a1();

        subClass child = new subClass();    // The output is based on reference ty[e
        child.a1();

        MethodHiding parent1 = new subClass();  // The output is based on reference ty[e
        parent1.a1();

        // output
        //Parent Method
        //Child Method
        //Parent Method

    }
}
