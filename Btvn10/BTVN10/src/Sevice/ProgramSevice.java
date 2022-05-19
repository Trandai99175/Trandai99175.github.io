package Sevice;

import Model.Program;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ProgramSevice {

    private Pattern matcher;
    //    Program programs = new ArrayList<>();
    List<Program> programs = new ArrayList<> ( );

//    List<User> newUser = new ArrayList<>();

    private List<Program> init(Program program) {
        try {
            programs.add (new Program ("dai", "dai@gmail.com", 1234567));
            programs.add (new Program ("hung", "hung@gmail.com", 23456789));
            programs.add (new Program ("khanh", "khanh@gmail.com", 123467899));
            programs.add (new Program ("trung", "trung@gmail.com", 34567899));
            programs.add (new Program ("bac", "bac@gmail.com", 1256668));
        } catch (RuntimeException e) {
            System.out.println (e.getMessage ( ));
            e.printStackTrace ( );
        }
        return null;
    }
    public ArrayList<Program> getPrograms(String s) {
        return (ArrayList<Program>) programs;
    }

    //    in ra thong tin
    public void prinInfo(ArrayList<Program> list) {
        for (Program program : list) {
            System.out.println (program);
        }
    }
    //   ******** đăng nhập thàn công*****+-
    public Program login() throws RuntimeException, MyException {

        Scanner sc = new Scanner (System.in);
        System.out.print ("nhap email: ");
        String email = sc.nextLine ( );
        System.out.print ("Nhap mat khau là: ");
        String password = sc.nextLine ( );
        //        ArrayList<Program> programs1 = new ArrayList<> ( );
//        ArrayList<Product> list = new ArrayList<>()
        Program program = new Program ( );
            int count = 0;
            for (Program program1 : program) {
                if (program.getEmail ( ).equals (email) && Objects.equals (program.getPassword ( ), password)) {
                    program = (Program) programs;
                    count++;
                    System.out.println (" bạn đã đăng nhập thành công");
                }
            }
        if (count == 0){
            throw new MyException("Email hoac Mat khau khong chinh xac");
        }
        return program;
    }
    //Thay đôi username
    public Program updateUsername(Program program) {
        Scanner sc = new Scanner (System.in);
        System.out.println (" nhap ten moi:");
        String newUsername = sc.nextLine ( );
        program.setUsername (newUsername);
        return program;
    }

    //Thay đôi email
    public Program updateEmail(Program program) {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Email moi:");
        String newEmail = sc.nextLine ( );
        program.setEmail (newEmail);
        return program;
    }
    //
    //Thay đôi Password
    public Program updatePassword(Program program) {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Email moi:");
        int newPassword = sc.nextInt ( );
        program.setPassword (newPassword);
        return program;
    }
    //    Quên mật khẩu
    public Program Email1(Program program) {
        Scanner sc = new Scanner (System.in);
        System.out.println (" Email nhap Email cua ban:");
        String newEmail = sc.nextLine ( );
        program.setEmail (newEmail);
        return program;
    }
    //    Tạo tài khoản mới
    public Program creatProgram() throws IOException, MyException {
        Scanner sc = new Scanner (System.in);
        String email = "";
        String email_pattern = "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
        System.out.print ("Nhap user email: ");
        email = sc.nextLine ( );
        if (!Pattern.matches (email_pattern, email)) {
            throw new MyException ("Email khong dung dinh dang");
        }
        int count = 0;
        for (Program e : programs) {
            if (e.getEmail ( ).equals (email)) {
                count++;
            }
        }
        if (count > 0) {
            throw new MyException ("Email da ton tai");
        }
        System.out.println ("nhap ten:");
        String name = sc.nextLine ( );
        System.out.println ("nhap mat khau:");
        int pass = Integer.parseInt (sc.nextLine ( ));
        Program program = new Program (name, email, pass);
        final var program1 = program;
        return program1;
    }


}

















