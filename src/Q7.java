public class Q7 {
    public static void main(String[] args) {
        StringBuilder Hello=new StringBuilder("Hello");
        System.out.println(Hello.charAt(0));                         //first
        System.out.println(Hello.charAt(4));                         //last
        Hello.deleteCharAt(0);                                 //remove the first
        Hello.deleteCharAt(3);                                 //remove the last
        System.out.println(Hello);
    }
}
