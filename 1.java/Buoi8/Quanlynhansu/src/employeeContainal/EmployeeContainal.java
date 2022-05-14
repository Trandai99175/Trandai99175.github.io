package employeeContainal;


import model.Employee;
import sevice.EmployeeSevice;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeContainal {

    private final EmployeeSevice employeeSevice= new EmployeeSevice ();


    public void run(){
        Scanner sc= new Scanner (System.in);
        boolean isContinue=true;
        int option=0;
        while (isContinue){
            prinMenu ();
            System.out.println (" nhap lua chon:" );
            option=Integer.parseInt (sc.nextLine ());

        }
        switch (option) {
            case 1:{
                ArrayList<Employee> employees= employeeSevice.getEmployees ();
                if (employees.isEmpty ()){
                    System.out.println ("khoong co nhan vien nao:" );
                }
                else {
                    System.out.println ("danh sach nhan vien" );
                }



            }
        }

    }




    private void prinMenu(){
        System.out.println ("menu:" );
        System.out.println (" 1.in thong tin nhan vien:" );
        System.out.println ("2. them nhan vien moi:" );
        System.out.println (" 3.tim kiem nhan vien theo ten" );

    }
}
