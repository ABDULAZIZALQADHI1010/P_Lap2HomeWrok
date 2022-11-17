import java.util.Scanner;
import java.lang.Math.*;
public class Q9 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input two integers");
        int i=in.nextInt(),s=in.nextInt();
        int sum=i+s,d=i-s;
        float avg=sum/2;
        System.out.println("sum="+sum+"\tdifference="+d+"\tproduct="+(i*s)+"\taverage="+avg+"\tdistance="+Math.abs(d)+"\tmax="+Math.max(i,s)+"\tmin="+Math.min(i,s));
    }
}
