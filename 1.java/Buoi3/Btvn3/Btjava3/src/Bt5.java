import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner sc= new Scanner (System.in);
        System.out.println ("Nhập bán kinh hình cầu a>0 (m):");
         double r= sc.nextDouble ( );
         double Tt= 4/3* PI* r*r;
        System.out.println ( " Thể tích hình cầu:"+ Tt );
    }
}
