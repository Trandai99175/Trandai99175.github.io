import java.util.Scanner;

public class Cau2 {
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        int dem =0;
        System.out.print("Nhập vào chuỗi : ");
        String str = sc.nextLine();
        String[] ar = str.split("[ ,.]");
        System.out.println(ar.length);
         for (int i=0; i< ar.length;i++){
             System.out.println (ar[i].indexOf ('o'));
         }
    }
}
