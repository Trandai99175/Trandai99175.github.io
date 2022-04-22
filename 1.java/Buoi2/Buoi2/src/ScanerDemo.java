import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập tên");
        String name = sc.nextLine();

        System.out.println(" nhập quê quán");
        String address = sc.nextLine();

        System.out.println("nhập tuổi");
        int age= sc.nextInt();


        System.out.println("nhập imail");
        String email=sc.nextLine();

        System.out.println(" tôi tên là"+ name + " năm nay tôi "+ age + "quê quán"+ address);
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
