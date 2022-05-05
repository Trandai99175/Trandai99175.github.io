import java.util.Scanner;

public class Cau5 {
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println (" nhập số hàng:");
        int hang = sc.nextInt ( );
        System.out.println (" nhập số cột:");
        int cot = sc.nextInt ( );
        int[][] numbers = new int[hang][cot];

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print (" nhap a [" + i + "][" + j + "]" + "\t");
                numbers[i][j] = sc.nextInt ( );
            }

        }
        System.out.println ("Mảng đã nhập vào:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print (numbers[i][j] + "\t");
            }
            System.out.println ( );
        }

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (i == j) {
                    System.out.print ("Phần tử đường chéo chính:"+numbers[i][j] + "\t");
                }
                System.out.println ( );
            }
        }

    }
}
