public class Account {
    private String holderName;
    private int accountNumber;
    private String accountType;
    private double currentBalence;

    public Account(String holderName, int accountNumber, String accountType, double currentBalence) { //q1,q2
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.currentBalence = currentBalence;
    }

    void depositMoney(double deposit) {         //q1,q2
        this.currentBalence = currentBalence + deposit;
    }

    void withdrawMoney(double withdraw) {      //q1,q2
        this.currentBalence = currentBalence - withdraw;
    }

    void displayAccountDetails() {            //q1,q2
        System.out.println("Name : " + holderName);
        System.out.println("Account Type : " + accountType);
        System.out.println("Account Number : " + accountNumber);

    }
    void setAccountType(String accountType){    //q2
        this.accountType=accountType;
    }
    void setHolderName(String holderName){    //q2
        this.holderName=holderName;
    }

    void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }

    void setCurrentBalence(double currentBalence){
        this.currentBalence=currentBalence;
    }

    public double checkBalence() {   //q1,q2
        return currentBalence;

    }
}