package Controler;

import Model.Program;
import Sevice.IOException;
import Sevice.MyException;
import Sevice.ProgramSevice;
import java.util.Scanner;
public class Programcontroler {
    private void printMenu() {
        System.out.println ("*********-MENU-*********");
        System.out.println ("1. Đăng nhâp");
        System.out.println ("2. Đăng ký");
        System.out.println ("3. Quên mật khẩu");
        System.out.println ("4. Thoat !");
    }
    private final ProgramSevice programSevice = new ProgramSevice ( );
    public void run() throws MyException, IOException {
        Scanner sc = new Scanner (System.in);
        boolean isContinue = true;
        int option;
        while (isContinue) {
            System.out.println ("Nhập lựa chọn:");
            option = Integer.parseInt (sc.nextLine ( ));
            switch (option) {
                case 1: {
                    System.out.println ("Đăng nhâp:");
                    Program program = new ProgramSevice ().login ();
                    boolean isSubContinue = true;
                    int subOption = 0;
                    while (isSubContinue) {
                        System.out.println ("1.  Doi username");
                        System.out.println ("2. Doi  email");
                        System.out.println ("3. Doi doi mat khau");
                        System.out.println ("4. Dang xuat");
                        System.out.println ("5. Thoat khoi chuong trinh");
                        System.out.print (" Nhap lua chon cua ban: ");
                        subOption = Integer.parseInt (sc.nextLine ( ));
                        switch (subOption) {
                            case 1: {
                                System.out.println ("Thay doi username");
                                programSevice.updateUsername (program);
                                break;
                            }
                            case 2: {
                                System.out.println ("Thay doi email");
                                programSevice.updateEmail (program);
                                Program program1=programSevice.updateEmail (program);
                                System.out.println ("Ban da thay doi Email:" );
                                System.out.printf (String.valueOf (program1));
                                break;
                            }
                            case 3: {
                                System.out.println ("Thay doi mat khau ");
                                programSevice.updatePassword (program);
                                break;
                            }
                            case 4: {
                                isSubContinue = false;
                                break;
                            }
                            case 5: {
                                System.out.println ("Thoat khoi chuong trinh");
                                isContinue = false;
                                isSubContinue = false;
                                break;
                            }
                            default: {
                                System.out.println ("Lua chon khong phu hop");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println ("Đăng ký");
                    Program program;
                    try {
                        program = programSevice.creatProgram ( );
                    } catch (IOException e) {
                        e.printStackTrace ( );
                    } catch (MyException e) {
                        e.printStackTrace ( );
                    }
                    System.out.println ("Bạn đã đăng ký thành công tài khoản:");

                    break;
                }
                case 3: {
                    System.out.println ("Quên mật khẩu");
                    break;
                }
                case 4: {
                    isContinue = false;
                    System.out.println ("Thoát ");
                    break;
                }
                default: {
                    System.out.println ("Lựa chọn không phù hợp");
                    break;
                }
<<<<<<< Updated upstream
=======


>>>>>>> Stashed changes
            }
        }
    }
}

