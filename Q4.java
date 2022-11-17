import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("input three numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        float avg=a+b+c;
        System.out.println("average="+(avg/3));

    }
}
