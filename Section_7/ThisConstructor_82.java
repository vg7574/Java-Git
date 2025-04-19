package Section_7;

public class ThisConstructor_82 {
    public static void main(String[] args) {
        Customer_82 cust1 = new Customer_82("GV", "gv74@gmail.com") ;
        Customer_82 cust2 = new Customer_82() ;
        Customer_82 cust3 = new Customer_82("GG", "6770977", "GG$$@gmail.com") ;
        System.out.println("Cust1 details : " + cust1.getCreditLimit() + "\n" +
                "Cust 2 details : " + "\n" + cust2.getName() + "\n" + cust2.getCreditLimit() +
                "\n" + cust2.getEmailAddress() + "\n" + "cust 3 details  :" + cust3.getName());
        System.out.println(cust2.getName() + "\nAfter changing cust2 name: " );
        // Therefore changed the name using setter.
        cust2.setName("GG");
        System.out.println(cust2.getName());
    }
}

