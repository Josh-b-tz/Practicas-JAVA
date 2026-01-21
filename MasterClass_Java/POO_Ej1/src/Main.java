//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account Josue = new Account("Josue", "josuebatz0.1@gmail,com", 37124197, 00001, 10000);
        Josue.depositFounds(400);
        Josue.withdrawals(400);

        Customer custm1 = new Customer("Pepe", "pepematamoros@gmail.com", 100000);
    }
}