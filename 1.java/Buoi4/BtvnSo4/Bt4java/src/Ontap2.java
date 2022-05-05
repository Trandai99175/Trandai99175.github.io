import java.util.Arrays;
import java.util.Scanner;

public class Ontap2 {
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {



//        nhap phan tu mang
        System.out.println (" nhập số lượng phần tử mảng:");
        int cout = sc.nextInt ( );

//        khơi tạo mảng
        int[] number = new int[cout];

        number = nhapSolieuphantu (number);
        System.out.println ("mảng đã nhập vào là :" + Arrays.toString (number));

        number = soChan (number, cout);
        for (int i = 0; i < cout; i++) {
            System.out.println (number[i]);
        }
        System.out.println (" tong so le:" + kiemTrachanle (number, cout));

        System.out.println ( "max:"+maxMin (number) );


    }


    public static int[] nhapSolieuphantu(int[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print ("Nhập phần tử thứ:" + (i + 1) + ":");
            number[i] = sc.nextInt ( );
        }
        return number;
    }

    public static int[] soChan(int[] number, int n) {
        for (int i = 0; i < n; i++) {
            if (number[i] % 2 == 0) {
                number[i] = number[i] + 1;
            }
        }
        return number;
    }

    public static int kiemTrachanle(int[] number, int n) {
        int chan = 0;
        int le = 0;
        for (int i = 0; i < n; i++) {
            if (number[i] % 2 != 0) {
                le = le + 1;
                continue;
            }

        }
        return le;

    }

    public static int maxMin(int[] number) {
        int max = number[0];
        for (int i = 0; i <number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }

        }
        return max;
    }

}
