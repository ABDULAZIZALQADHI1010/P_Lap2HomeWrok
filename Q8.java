import java.util.Scanner;
import java.lang.Math.*;
public class Q8 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input a number");
        double a= in.nextInt();
        System.out.println("squre="+(a*a)+"\tcube="+(a*a*a)+"\tforth power="+Math.pow(a,4));
    }
}
