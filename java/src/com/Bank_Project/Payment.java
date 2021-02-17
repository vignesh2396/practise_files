package Bank_Project;

import java.util.Date;

public abstract class Payment {
int paymentId;
Date paymentDate;

public Payment(){
    super();
    System.out.println("default constructor called from payment.java");
}
public Payment(int paymentId,Date paymentDate){
    this.paymentId = paymentId;
    this.paymentDate = paymentDate;
    System.out.println("Constructor with arguments is called from payment.java");
}

public void DisplayPaymentDetails(){
    System.out.println("Payment id : " + paymentId);
    System.out.println("Date : " + paymentDate);
}

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }
}