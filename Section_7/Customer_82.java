package Section_7;

public class Customer_82 {
    String name ;
    String creditLimit ;
    String emailAddress ;
    public Customer_82(String name, String creditLimit, String emailAddress) {
        this.name = name ;
        this.creditLimit = creditLimit ;
        this.emailAddress = emailAddress ;
    }
    public Customer_82() {
        this("default name", "default creditLimit", "default emailAddress") ;
    }
    public Customer_82(String name, String emailAddress) {
        this(name, "7000000", emailAddress) ;
    }
    public String getName() {
        return name ;
    }
    public String getCreditLimit() {
        return creditLimit ;
    }
    public String getEmailAddress() {
        return emailAddress ;
    }
    public void setName(String name) {
        this.name = name ;
    }

}
