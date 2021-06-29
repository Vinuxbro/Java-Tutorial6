public class Student {
    private String studentName;
    private String studentAddress;
    private int CurrentLevel;
    public double PassMark=50;
    private int StudentCount;


    public Student(String studentName,String studentAddress,int CurrentLevel){
        this.studentName=studentName;
        this.studentAddress=studentAddress;
        this.CurrentLevel=CurrentLevel;
        StudentCount+=1;

    }

    void StudentDetails(){
        System.out.println("Student Name    : "+studentName);
        System.out.println("Student Address : "+studentAddress);
        System.out.println("Current Level   : "+CurrentLevel);
    }

    boolean StudentPass(double mark1, double mark2, double mark3) {

        double total = mark1+mark2+mark3;
        double average = total/3;
        if (average>this.PassMark){
            return true;

        }
        return false;
    }








}
