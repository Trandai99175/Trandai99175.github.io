package btvn8;

import java.util.Scanner;

public class MainBt8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println (" nhập tên sách cần tim:");

        MovieSevice movieSevice = new MovieSevice ( );
        System.out.println ("*********** Danh sách theo Movie ***********");
        for (Movie movies : movieSevice.getMovies ( )) {
            System.out.println (movies);
        }
        SerialSevice serialSevice = new SerialSevice ( );
        System.out.println ("*********** Danh sách theo Serial***********");
        for (Serial serial : serialSevice.getSerials ( )) {
            System.out.println (serial);
        }

        // Tìm kiếm theo tên
        System.out.println ("*********** Tìm phim theo tiêu đề (tiếng việt có dấu) ***********");
        String title = sc.nextLine ( );
//        Kết quả
        System.out.println ("*********** Kết quả ***********");
        movieSevice.findByTitle (title);
        serialSevice.findByTitle (title);
    }
}
