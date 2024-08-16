package Encapsulation;

class PersonOutput {
    public static void main(String[] args) {
        Person person = new Person();
        person.setBankAcc(18192021);   // only using the getter setter method we can retrieve the users data
        System.out.println("User Account is: "+person.getBankAcc());
    }
}
