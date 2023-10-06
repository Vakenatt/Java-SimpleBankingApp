public class Customer {
    
    private String name;
    private String accountNumber;

    public Customer (String name, String accountNumber){

        this.name = name;
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

}
