package lamdafxn;
import java.util.*;
import  java.time.*;


public class ques {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id= sc.nextLine();
        int td =sc.nextInt();
        int dp=sc.nextInt();

        LocalDate dd =LocalDate.parse(id);
        int rd= td -dp;

        int year =dd.getYear();
        int dayyear =dd.getDayOfYear();

        System.out.println(dd);
        System.out.println(rd);
        System.out.println(year);
        System.out.println(dayyear);

    }
    
}
