import java.util.Scanner;

public class Inan {
    public static void main(String[] args) {
        System.out.println("xin chào");
        System.out.print("chay di");
        System.out.print("chạy đi");


        System.out.printf("may is %s\n", "Hien");


        System.out.printf("%-20s %-20s %-10s\n", "hoten", "mail", "tuoi");
        System.out.printf("%-20s %-20s %-10d\n", "bui hien", "hien1@", 25);
        System.out.printf("%-20s %-20s %-10d\n", "dai", "dien1@", 21);
        System.out.printf("%-20s %-20s %-10d\n", "khanh", "gien1@", 19);


        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số a:");
        int a = sc.nextInt();

        System.out.println(" nhập vào số b:");
        int b = sc.nextInt();

        System.out.println(a + "+" + b + "=" + (a + b));
        System.out.println(a + "-" + b + "=" + (a - b));
        System.out.println(a+"/"+b+"="+(a/b));



    }
}
