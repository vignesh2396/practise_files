package Bank_Project;

import java.util.Date;

public class CheckPayment extends Payment{
String CheckNo;
String IssuedBank;
double Amount;

public void DisplayPaymentDetails(){
	super.DisplayPaymentDetails();
	System.out.println("check number : " + CheckNo);
	System.out.println("issued bank name : " + IssuedBank);
	System.out.println("amount : " + Amount);
}

	public CheckPayment(int paymentId, Date paymentDate, String checkNo, String issuedBank, double amount) {
		super(paymentId, paymentDate);
		CheckNo = checkNo;
		IssuedBank = issuedBank;
		Amount = amount;
	}
}