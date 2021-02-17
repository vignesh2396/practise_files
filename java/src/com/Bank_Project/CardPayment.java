package Bank_Project;

import java.util.Date;

public class CardPayment extends Payment{
String CardNo;
String Cvv;
double Amount;

    public CardPayment(int paymentId, Date paymentDate, String cardNo, String cvv, double amount) {
        super(paymentId, paymentDate);
        this.CardNo = cardNo;
        this.Cvv = cvv;
        this.Amount = amount;
    }
//polymorphism example
    public void DisplayPaymentDetails(){
        super.DisplayPaymentDetails();
        System.out.println("card number : " + CardNo);
        System.out.println("amount : " + Amount);
    }
    public CardPayment() {
        super();
        System.out.println("default constructor called from card payment.java");
    }

     public void setAmount(double amount) {
        Amount = amount;
    }


    public void setCardNo(String cardNo) {
        CardNo = cardNo;
    }

     public void setCvv(String cvv) {
        Cvv = cvv;
    }
}