import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //q2
        int option=0;


        Account acc1= new Account("John",23654,"Current",600);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Account Holder's Name : ");
        String AccName = input1.nextLine();
        acc1.setHolderName(AccName);


        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Account Number : ");
        int AccNumber = input2.nextInt();
        acc1.setAccountNumber(AccNumber);

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter account initial Balance : ");
        double Accbalance = input3.nextDouble();
        acc1.setCurrentBalence(Accbalance);

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Account type : ");
        String AccType= input4.nextLine();
        acc1.setAccountType(AccType);

        System.out.println("\n\nCreating "+AccName+"'s Account....." );

        System.out.println("To Withdraw Money        :Press 1");
        System.out.println("To Deposit Money         :Press 2");
        System.out.println("To Check Balance         :Press 3");
        System.out.println("To View Account Details  :Press 4");
        System.out.println("To Exit                  :Press 5");


        while (option != 5) {

            Scanner input5 = new Scanner(System.in);
            option = input5.nextInt();

            switch (option){
                case 1:
                    System.out.println("Enter your withdraw : ");
                    Scanner input6 = new Scanner(System.in);
                    double AccWithdraw = input6.nextDouble();
                    acc1.withdrawMoney(AccWithdraw);
                    System.out.println("To Withdraw Money        :Press 1");
                    System.out.println("To Deposit Money         :Press 2");
                    System.out.println("To Check Balance         :Press 3");
                    System.out.println("To View Account Details  :Press 4");
                    System.out.println("To Exit                  :Press 5");
                    break;



                case 2:
                    System.out.println("Enter your deposit : ");
                    Scanner input7 = new Scanner(System.in);
                    double AccDeposit = input7.nextDouble();
                    acc1.depositMoney(AccDeposit);
                    System.out.println("To Withdraw Money        :Press 1");
                    System.out.println("To Deposit Money         :Press 2");
                    System.out.println("To Check Balance         :Press 3");
                    System.out.println("To View Account Details  :Press 4");
                    System.out.println("To Exit                  :Press 5");
                    break;


                case 3:
                    System.out.println("Your current balance is : "+acc1.checkBalence());
                    System.out.println("To Withdraw Money        :Press 1");
                    System.out.println("To Deposit Money         :Press 2");
                    System.out.println("To Check Balance         :Press 3");
                    System.out.println("To View Account Details  :Press 4");
                    System.out.println("To Exit                  :Press 5");
                    break;


                case 4:
                    acc1.displayAccountDetails();
                    System.out.println("To Withdraw Money        :Press 1");
                    System.out.println("To Deposit Money         :Press 2");
                    System.out.println("To Check Balance         :Press 3");
                    System.out.println("To View Account Details  :Press 4");
                    System.out.println("To Exit                  :Press 5");
                    break;

                case 5:
                    System.out.println("........THANK YOU...........");
                    break;
                default:
                    System.out.println("Invalid Option!!!!!!! Please enter valid option.....");



        }














        }








    }
}
