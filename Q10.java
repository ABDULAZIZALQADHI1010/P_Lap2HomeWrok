import java.lang.Math.*;
public class Q10 {
    public static void main(String[] args) {
        int i=20,s=25;
        int sum=i+s,d=i-s;
        float avg=sum/2;
        System.out.println("sum:\t\t\t"+sum+"\ndifference\t\t"+d+"\nproduct:\t\t"+(i*s)+"\naverage:\t\t"+avg+"\ndistance:\t\t"+Math.abs(d)+"\nmax:\t\t\t"+Math.max(i,s)+"\nmin:\t\t\t"+Math.min(i,s));
    }
}
