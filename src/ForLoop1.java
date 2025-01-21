import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=12345;
        String p=Integer.toString(number);
        for (int i=p.length()-1;i>=0;i--){
            System.out.println(p.charAt(i));
        }
    }
}
