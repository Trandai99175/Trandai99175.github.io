public class Test1 {
    public static void main(String[] args) {
//        toạ đối tượng
        Pesion pesion = new Pesion ();
//        Gián giá trị cho đối tương

        pesion.name=" Bùi Hiên";
        pesion.age= 25;
        pesion.address= " Thái Bình";

        System.out.println ( pesion.name+"-"+ pesion.age+"-"+pesion.address );


//         gọi phương thức;
        pesion.play ();
        pesion.eat ("phở");
        System.out.println ( pesion.getYearOfBrith ());


//        khởi toạ đối tượng 1 tham số
        Pesion pesion1= new Pesion ( " Nguyễn văn A" );
        System.out.println (pesion1 );
//        Khởi tao 2 giá tri

        Pesion pesion2 =new Pesion ( "Trân văn B", 40 );
        System.out.println (pesion2 );




    }
}
