import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int x,c,v;
        Scanner in=new Scanner(System.in);
        System.out.println("enter x=");
        x=in.nextInt();
        System.out.println("enter c=");
        c=in.nextInt();
        System.out.println("enter v=");
        v=in.nextInt();
        System.out.println("Average="+(x+c+v)/3+"%");
    }
}
