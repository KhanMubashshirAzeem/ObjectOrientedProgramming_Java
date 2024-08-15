package Interface;

// but if we declare class as abstract then we can declare one method of parent
abstract class Interf2 implements Interf1 {
    // method should be public ( Compulsory )
    // all the method in Parent Class should be declared in Child Class
    @Override
    public void m1() {   // If method is not public then error

    }
}
