import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        int length , width;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter Th length=");
        length=in.nextInt();
        System.out.println("Enter Th width=");
        width=in.nextInt();
        System.out.println("Th rectangle area is="+(length * width));
        System.out.println("Th rectangle surroundings is="+2*(length+width));
    }
}
