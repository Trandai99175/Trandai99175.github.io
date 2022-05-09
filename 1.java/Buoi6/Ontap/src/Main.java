import Baitap6.sevice.BookSevice;
import Baitapvn6.model.Book;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean isContinue = true;
        int option = 0;

        BookSevice bookSevice = new BookSevice ( );
        // Danh sách book
        System.out.println ("*********** Danh sách book ***********");
        for (Book book : bookSevice.getBooks ( )) {
            System.out.println (book);
        }
        while (isContinue) {
            showMenu ( );
            System.out.print ("Nhập lựa chọn : ");
            option = Integer.parseInt (sc.nextLine ( ));

            switch (option) {
                case 1: {

                    // Tìm kiếm theo tên
                    System.out.println ("*********** Tìm kiếm theo tên ***********");
                    String name = sc.nextLine ( );
                    bookSevice.findByTitle (name);
                    break;
                }
                case 2: {

                    // Tìm kiếm theo danh mục
                    System.out.println ("*********** Tìm kiếm theo danh mục ***********");
                    String findByCategory = sc.nextLine ( );
                    bookSevice.findByCategory (findByCategory);
                    break;
                }
                case 3: {

                    // Tìm kiếm theo năm
                    System.out.println ("*********** Tìm kiếm theo năm ***********");
                    int Year = sc.nextInt ( );
                    bookSevice.findByPublishingOfThisYear ( );
                    break;
                }
                case 4 : {
                    isContinue = false;
                    break;}
                default: {
                    System.out.println ("Lựa chọn không hợp lệ");
                    break;
                }


            }
        }

    }
    public static void showMenu() {
        System.out.println("1 - tìm theo tên");
        System.out.println("2 - Tìm theo danh mục");
        System.out.println("3 - Tìm kiếm theo năm");
        System.out.println("4 - Thoát chương trình");
    }
}
