import java.util.*;
public class CS3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int number=in.nextInt();
        String week=switch(number) {  //Rule Switch
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Wrong number";
        };
        System.out.println(week);
    }
}
