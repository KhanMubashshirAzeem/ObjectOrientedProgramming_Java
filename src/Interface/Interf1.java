package Interface;

interface Interf1 {
    // Every method in interface must be public or abstract.
    public void m1();

    public void m2();
}

class ServiceProvider implements Interf1 {
    // method should be public ( Compulsory )
    // all the method of Parent Class should be declared in Child Class
    @Override
    public void m1() {   // If method is not public then error

    }
    @Override
    public void m2() {

    }
}
