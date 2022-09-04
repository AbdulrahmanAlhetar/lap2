import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        double R,A,Pi=3.14;                                //R=Radius   , A=Area
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Th R=");
        R=in.nextDouble();
        A=Pi *(R*R);
        System.out.println("A="+A);
        System.out.println("circumference="+(2 * Pi * R));
    }
}
