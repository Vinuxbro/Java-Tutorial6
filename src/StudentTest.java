import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Vinuka","Colombo",5);
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter your 1st module marks : ");
        double mark1 = input1.nextDouble();

        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter your 1st module marks : ");
        double mark2 = input1.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter your 1st module marks : ");
        double mark3 = input1.nextDouble();

        boolean result = student1.StudentPass(mark1,mark2,mark3);

        if (result==true){
            System.out.println("You pass the module.........");
        }
        else{
            System.out.println("You Fail the module!!!!!!!!!!");
        }

    }
}
