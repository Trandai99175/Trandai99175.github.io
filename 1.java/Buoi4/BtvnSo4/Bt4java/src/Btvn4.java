import java.util.Scanner;

public class Btvn4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Nhập vào chuỗi : ");
        String str = sc.nextLine ( );

        // Tách choãi thành choãi nhỏ dựa vào dấu cách
        String[] temp = str.split (" ");
        // sau khi tách xong, gán xâu st thành sâu rỗng
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf (temp[i].charAt (0)).toUpperCase ( ) + temp[i].substring (1);
            str += " ";
            continue;

        }

        System.out.println (str);
    }
}
