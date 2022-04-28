
import java.util.Arrays;
import java.util.Scanner;

public class Bt5 {
    public static void main(String[] args) {

        // Nhập
        int[] numbersInput = createArray ( );

        System.out.println (" Mang mới nhập vào:" + Arrays.toString (numbersInput));

    }

    public static int[] createArray() {
        Scanner sc = new Scanner (System.in);
        // Nhập mảng
        System.out.print ("Nhập vào số phần tử của mảng : ");
        int count = sc.nextInt ( );

        // Khởi tạo mảng với số phần tử = count
        int[] numbersInput = new int[count];

        // Nhập vào từng phần tử của mảng
        for (int i = 0; i < numbersInput.length; i++) {
            System.out.print ("Nhập vào phần tử thứ " + (i + 1) + " : ");
            numbersInput[i] = sc.nextInt ( );
        }
        return numbersInput;
    }
    public static int[] sumArray(int[] number, int n) {

        for (int i = 0; i < n; i++) {
            if (number[i] % 2 == 0) {
                number[i] = number[i] + 1;
                System.out.println (number[i] + " ");
            }
        }
        return number;
    }

}

