import java.util.*;
public class If_Else {
    public void studentGrade(int marks) {
        if(marks>=90) {
            System.out.println("Grade A");
        } else if(marks>=70 && marks<90) {
            System.out.println("Grade B");
        } else if(marks>=50 && marks<70) {
            System.out.println("Grade C");
        } else if(marks>=35 && marks<50) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        } 
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt();
        If_Else ob=new If_Else();
        ob.studentGrade(marks);
    }
}