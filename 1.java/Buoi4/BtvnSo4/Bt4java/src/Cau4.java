public class Cau4 {
    public static void main(String[] args) {
        int i =0;
        int count=0;
        while (count<10){
            if (isPrimeNumber (i)) {
                System.out.println ( "Mười số nguyên tố đầu tiên là:"+i + " ");
                count++;

            }
            i++;
        }
        for (i = 0; i < 10; i++) {
            if (isPrimeNumber (i)) {
                System.out.println ("Các số nguyên tố nhỏ hơn 10 là: "+i + " ");

            }
        }

    }

    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt (n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}