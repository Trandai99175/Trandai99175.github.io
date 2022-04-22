import java.util.Scanner;

public class Btvn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Nhập chiều dài hình chữ nhật (m):");
        Double a = sc.nextDouble();

        System.out.println(" nhập chiều rộng hình chữ nhật (m):");
        Double b = sc.nextDouble();

        System.out.println(" Chu vi hình chữ nhật là:" + "=" + (2 * (a + b)));
        System.out.println(" Diên tích hình chữ nhật là:" + "=" + (a * b));

    }
}
