import java.util.Arrays;
import java.util.Scanner;

public class Ontapvn {
    public static Scanner sc= new Scanner (System.in);

    public static void main(String[] args) {
//         nhập bàn phím
        System.out.println (" nhập số lượng phần tử");
        int cout = sc.nextInt ( );
//        khơi tạo mảng
        int[] number = new int[cout];


        number =nhapArray (number);
        System.out.println (Arrays.toString (number) );
        
        number =chuyenSochan (number,cout);
        for (int i=0;i<cout;i++){
            System.out.println (number[i] );

        }

    }


         public static int [] nhapArray( int [] number){

         for (int i=0; i<number.length;i++){
             System.out.println (" nhập phần tử thứ:" +(i+1)+";" );
             number[i]= sc.nextInt ( );
         }
         return number;

    }
    public static int[] chuyenSochan(int [] number, int n){
        for (int i=0; i<n; i++){
            if (number[i]%2==0){
                number[i]=number[i]+1;
            }
        }
        return number;
    }


}
