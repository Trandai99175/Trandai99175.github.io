import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int totalMoney = 0;
        for (int i=1;i<=100;i++){
            if (i % 5 == 0) {
                totalMoney = totalMoney + i;
                System.out.println( totalMoney);

            }

        }

    }
}
