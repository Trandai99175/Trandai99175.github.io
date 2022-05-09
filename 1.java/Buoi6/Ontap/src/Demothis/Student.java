package Demothis;

public class Student {
    public String name;
    public int age;
    public Gender gender;

    public Student() {
        System.out.println (" Constructor mặc định được gọi:" );
    }
    public static  String school= " le quy don";

    public Student(String name) {
        System.out.println ( " constructor 1 tham số:" );
        this.name = name;
    }

    public Student(String name, int age) {
        this(name);
        System.out.println (" Constructor 2 tham số:" );
        this.age = age;
    }

    public Student(String name, int age, Gender gender) {
        this(name, age);
        this.gender = gender;
        System.out.println (" Constructor full tham số:" );

    }

    static {
        System.out.println("Đây là khối static");
    }

    public static void main(String[] args) {
        System.out.println (" Đây là hàm main của Sudent" );
    }


    public void sayhello(){
        System.out.println (" sayhello" );
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
