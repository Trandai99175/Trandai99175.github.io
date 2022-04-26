import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner ( System.in);

        System.out.println ("Số liêu sao chép X10 : ");
        String name = sc.nextLine ( );
        System.out.println ("Nhập số nguyên dương : ");
        int a = sc.nextInt ( );
        for (int i = 1; i <= a;  i++) {
            System.out.printf ("-"+ name);
        }

    }
}
