package Bank_Project;

class Account {
    private int accountId;
    private String accountName;
    private double accountBalance;

    //Default Constructor
    public Account() {

    }

    //Constructor with arguments
    public Account(int accId,String accName,double bal){
        this.accountId = accId;
        this.accountName = accName;
        this.accountBalance = bal;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
