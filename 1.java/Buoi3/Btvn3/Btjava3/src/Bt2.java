import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println ("Số liêu sao chép X10 : ");
        String name = sc.nextLine ( );
        for (int i = 1; i <= 10;  i++) {
            System.out.printf ("-"+ name);
        }
    }
}
