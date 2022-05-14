package sevice;

import model.Employee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class EmployeeSevice {

    private ArrayList<Employee> employees;

    public EmployeeSevice(){
        intt ();
    }



    private void intt(){
        employees = new ArrayList<> ();
        employees.add (new Employee ( 1, " Nuyen van a", "agmail",1400000 ));
        employees.add (new Employee ( 2, " Nuyen van b", "bgmail",1500000 ));
        employees.add (new Employee ( 3, " Nuyen van c", "cgmail",1600000 ));
        employees.add (new Employee ( 4, " Nuyen van d", "dgmail",1700000 ));

    }
//    tra ve danh sach
     public ArrayList<Employee> getEmployees(){
        return employees;
     }



//    in ra thong tin

    public void pringInfor(ArrayList<Employee>list){
        for ( Employee employee:list){
            System.out.println (employee );
        }
    }

//    them nhan vien moi
    public Employee createEmployee(){
        Scanner sc= new Scanner (System.in);
        Random rd= new Random ();
        int id= rd.nextInt ( );;

        System.out.println (" nhap ten" );
        String name= sc.nextLine ();

        System.out.println (" nhap email:" );
        String email= sc. nextLine ();

        System.out.println (" nhap luong:" );
        int salary = Integer.parseInt (sc.nextLine ());

        Employee employee= new Employee (id, name,email,salary);
        employees.add (employee);
        return employee;
    }
     public  ArrayList<Employee> findByname(String name){
        ArrayList<Employee> list= new ArrayList<> ();
        for ( Employee e: employees){
            if (e.getName ().toLowerCase ().contains (name.toLowerCase ( ))){
                list.add (e);
            }
        }
         return list;
     }



     public ArrayList< Employee> findBysalary(int minsalary, int maxsalary){
         ArrayList<Employee> list= new ArrayList<> ();
         for ( Employee e: employees){
             if (e.getSalary ()>minsalary & e.getSalary ()<maxsalary){
                 list.add (e);
             }
         }
        return list;
     }

}

