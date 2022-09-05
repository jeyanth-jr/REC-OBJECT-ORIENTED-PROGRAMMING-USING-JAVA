/*To print the transaction details using interface
•	create an interface iaccount and define an abstract method
•	create two classes bank 1 and bank2 which implements iaccount and define methods within it and display transaction details
*/

interface iaccount{
    int n=15000;
    int x=2500;
    String name="Kumar";
    abstract void transactionDetails();
}
class Bank1 implements iaccount{
    public void transactionDetails() {
        System.out.println("Account holder:" + name);
        System.out.println("Current Balance:" + n);
        System.out.println("EMI:"+ x);
        System.out.println("Thanks for using our service today, Have a nice day!!!");
    }
}
class Bank2 implements iaccount{
    public void transactionDetails() {
        System.out.println("Welcome to our bank");
        System.out.println("Account holder:" + name);
        System.out.println("Current Balance:" + n);
        System.out.println("EMI:"+ x);
    }
}

class Interface2{
    public static void main(String[] args) {
        Bank1 obj=new Bank1();
        Bank2 obj1=new Bank2();
        obj.transactionDetails();
        obj1.transactionDetails();
    }
}
