
public class Driver {
    public static void main(String[] args) {
        BankAccount bailey = new BankAccount("Bailey");
        bailey.deposit(500.0);
        BankAccount jordan = new BankAccount("Jordan");
        jordan.deposit(200.0);
        bailey.transfer(100.0, jordan);
        jordan.withdraw(50.0);
        jordan.withdraw(600.0);
        System.out.println(jordan.getBalance());
    }
}
