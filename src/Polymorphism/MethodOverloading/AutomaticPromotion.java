package Polymorphism.MethodOverloading;

public class AutomaticPromotion {
    void m1(int a){    // we declare "a" as a integer
        System.out.println("Checking Automatic promotion");
    }

    void m1(Object o){
        System.out.println("Object Version");
    }

    public static void main(String[] args) {
        AutomaticPromotion automaticPromotion = new AutomaticPromotion();
        automaticPromotion.m1('a');    // but we are not getting error because of automatic promotion of datatype happen.
        automaticPromotion.m1(new Object());
    }

}
