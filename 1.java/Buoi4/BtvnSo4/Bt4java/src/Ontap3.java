import java.util.Scanner;

public class Ontap3 {
    public static Scanner sc= new Scanner (System.in);
    public static void main(String[] args) {
        int[] number={1,2,3,4,5};
        int a= sc.nextInt ( );
        System.out.println ( kiemTraphantu (number,a) );

    }
    public static boolean kiemTraphantu(int[] number, int a){
        for (int i=0; i < number.length; i++){
            if (number[i] == a)
            return true;
        }
        return false;
    }

}
