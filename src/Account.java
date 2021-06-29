public class Account {
    private String holderName;
    private int accountNumber;
    private String accountType;
    private double currentBalence;

    public Account(String holderName, int accountNumber, String accountType, double currentBalence) {
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalence = currentBalence;
    }

    void depositMoney(double deposit) {
        this.currentBalence = currentBalence + deposit;
    }

    void withdrawMoney(double withdraw) {
        this.currentBalence = currentBalence - withdraw;
    }

    void displayAccountDetails() {
        System.out.println("Name : " + holderName);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Number : " + accountNumber);

    }
    void setAccountType(String accountType){
        this.accountType=accountType;
    }
    void setHolderName(String holderName){
        this.holderName=holderName;
    }

    public double checkBalence() {
        return currentBalence;

    }
}