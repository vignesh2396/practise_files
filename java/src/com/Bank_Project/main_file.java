package Bank_Project;

import java.util.Date;

public class main_file {

    public static void main(String[] args) {
//object created for Constructor 1 also known as default Constructor
// Account() class has been referred from Account.java file
        var obj = new Account();
            obj.setAccountId(100);
            obj.setAccountName("PythonDeveloper");
            obj.setAccountBalance(100000.00);
            System.out.println("Account ID : " + obj.getAccountId());
            System.out.println("Account Name : " + obj.getAccountName());
            System.out.println("Account Balance : " + obj.getAccountBalance());

//object created for Constructor 2 with arguments
        var obj2 = new Account(200,"WebDeveloper",500000.00);
            System.out.println("Account ID : " + obj2.getAccountId());
            System.out.println("Account Name : " + obj2.getAccountName());
            System.out.println("Account Balance : " + obj2.getAccountBalance());

//object created for Overloading methods from AccountActivity.java file
        var obj3 = new AccountActivity();
            obj3.displayMsg();
            obj3.displayMsg("message 2");
            obj3.displayMsg(100);

//there is not need for creating instance object for class or method used "static" keyword
//this class and method is derived from CustomerContent.java file
        System.out.println(CustomerContent.counter);
        CustomerContent.dispMessage();

//example for superclass and subclass
        var pay = new CardPayment();
            pay.setPaymentId(12356);
            pay.setPaymentDate(new Date());
            pay.setCardNo("987654321");
            pay.setCvv("159");
            pay.setAmount(3500.00);
            pay.DisplayPaymentDetails();

        var pay2 = new CardPayment(1,new Date(),"123456789","123",4000.00);
            pay2.DisplayPaymentDetails();

        Payment pay3 = new CheckPayment(3,new Date(),"123456","IOB",5600.00);
        pay3.DisplayPaymentDetails();
    }
}