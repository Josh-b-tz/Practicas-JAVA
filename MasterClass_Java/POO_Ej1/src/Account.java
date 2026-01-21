public class Account {

    private String customerName;
    private String customerEmail;
    private int phoneNumber;
    private int acountNumber;
    private int acountBalance;

    public Account(String customerName, String customerEmail, int phoneNumber, int acountNumber, int acountBalance) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
        this.acountNumber = acountNumber;
        this.acountBalance = acountBalance;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Customer Email : " + customerEmail);
        System.out.println("Customer Phone Number : " + phoneNumber);
        System.out.println("Account Number : " + acountNumber);
        System.out.println("Account Balance : " + acountBalance);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }

    public int getAcountBalance() {
        return acountBalance;
    }

    public void setAcountBalance(int acountBalance) {
        this.acountBalance = acountBalance;
    }

    public void depositFounds(int amount) {
        System.out.println("Deposit Amount : " + amount);
        this.acountBalance += amount;
        System.out.println("Your Balance : " + this.acountBalance);
    }
    public void withdrawals(int amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
        } else{
            this.acountBalance -= amount;
            System.out.println("Your Balance : " + this.acountBalance);
        }
    }

}
