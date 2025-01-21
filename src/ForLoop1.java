import java.util.Scanner;

public class ForLoop1 {
    public static void main(String[] args) {

        int number=12345;
        String p=Integer.toString(number);
        for (int i=p.length()-1;i>=0;i--){
            System.out.println(p.charAt(i));
        }
        System.out.println();
for (int i=1;i<=5;i++){
    System.out.println(i);
}

    }
}
