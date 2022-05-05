import java.util.Arrays;
import java.util.Scanner;

public class MenuOntap {
    public static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        boolean isContinue = true;
        int option = 0;
        showMenu();


        while (isContinue) {
            System.out.println ("nhap lua chon bai:");
            option = Integer.parseInt (sc.nextLine ( ));

            switch (option) {
                case 1: {
                    System.out.println (" nhập số lượng phần tử mảng:");
                    int cout = sc.nextInt ( );

                    int[] number = new int[cout];
                    number = nhapSolieuphantu (number);
                    System.out.println ("mảng đã nhập vào là :" + Arrays.toString (number));
                    break;

                }
                case 2: {
                    System.out.println (" nhập số lượng phần tử mảng:");
                    int cout = sc.nextInt ( );

                    int[] number = new int[cout];
                    number = nhapSolieuphantu (number);
                    System.out.println ("mảng đã nhập vào là :" + Arrays.toString (number));
                    number = soChan (number, cout);
                    for (int i = 0; i < cout; i++) {
                        System.out.println (number[i]);
                    }
                    System.out.println (" tong so le:" + kiemTrachanle (number, cout));

                    System.out.println ("max:" + maxMin (number));
                    break;
                }
                default: {
                    System.out.println ("Lựa chọn không hợp lệ");
                    break;

                }

            }


        }
    }
    public static void showMenu() {
        System.out.println("1 - Bài 1");
        System.out.println("2 - Bài 2");
        System.out.println("3 - Thoát chương trình");
    }


        public static int[] nhapSolieuphantu ( int[] number){
            for (int i = 0; i < number.length; i++) {
                System.out.print ("Nhập phần tử thứ:" + (i + 1) + ":");
                number[i] = sc.nextInt ( );
            }
            return number;
        }

        public static int[] soChan ( int[] number, int n){
            for (int i = 0; i < n; i++) {
                if (number[i] % 2 == 0) {
                    number[i] = number[i] + 1;
                }
            }
            return number;
        }

        public static int kiemTrachanle ( int[] number, int n){
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

        public static int maxMin ( int[] number){
            int max = number[0];
            for (int i = 0; i < number.length; i++) {
                if (number[i] > max) {
                    max = number[i];
                }

            }
            return max;
        }

    }
