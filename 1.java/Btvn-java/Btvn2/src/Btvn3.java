import java.util.Scanner;

public class Btvn3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập họ tên : ");
        String name = sc.nextLine();

        System.out.println("Nhập tuổi : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.println("Giới tính : ");
        String gender = sc.nextLine();


        System.out.println("Nơi sống và làm việc : ");
        String address = sc.nextLine();


        System.out.println("Xin chào các bạn mình tên là " + name + ", năm nay mình " + age
                + " tuổi, giới tinh " + gender + " .Hiện tại mình đang sống và làm việc tại" + address);

    }
}
