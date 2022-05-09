import java.time.Instant;
import java.time.LocalDate;

public class Pesion {
    //    khai báo thuộc tính
    public String name;
    public int age;
    public String address;
//    khởi tao cotracter


    public Pesion() {
        System.out.println (" Constructor mặc định được gọi:" );
    }

    public Pesion(String name) {
        System.out.println ( " constructor 1 tham số:" );
        this.name = name;
    }

    public Pesion(String name, int age) {
        System.out.println (" Constructor 2 tham số:" );
        this.name = name;
        this.age = age;
    }

    public Pesion(String name, int age, String address) {
        System.out.println (" Constructor full tham số:" );
        this.name = name;
        this.age = age;
        this.address = address;
    }

    //     khai báo phương thức

    public void play (){
        System.out.println (" Đang chơi game:" );
    }
    public void eat(String foodName){
        System.out.println (" đang ăn"+foodName );
    }
    public int getYearOfBrith() {
        return LocalDate.now ().getYear ()-age;
    }

    @Override
    public String toString() {
        return "Pesion{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}


