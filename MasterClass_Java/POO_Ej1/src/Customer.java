public class Customer {

    private String customerName;
    private String customerEmail;
    private int creditLimit;


    public Customer(String customerName, String customerEmail, int creditLimit) {
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.creditLimit = creditLimit;

        System.out.println("Customer Name : " + customerName
        + " Customer Email : " + customerEmail
        + " Credit Limit : " + creditLimit);
    }

    public Customer(){
        this("JOSUE", "josuebatz0.1@gmail,com", 10000);
    }

    public Customer(String customerName, String customerEmail) {
        this( customerName, customerEmail, 10000);
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
