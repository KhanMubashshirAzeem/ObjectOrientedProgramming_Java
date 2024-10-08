package Encapsulation;
// Why Encapsulation?
// Better control of class attributes and methods
// Class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
// Flexible: the programmer can change one part of the code without affecting other parts
// Increased security of data

// Storing the private data of user.
public class Person {
    private int bankAcc;


    // Getter
    public int getBankAcc() {
        return bankAcc;
    }

    // Setter
    public void setBankAcc(int bankAcc) {
        this.bankAcc = bankAcc;
    }

}
