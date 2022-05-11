package DemoGet;

public class Test1 {
    public static void main(String[] args) {
        Persion persion =new Persion ();

//        thêm thông tin đối tượng
        persion.setId (1);
        persion.setName (" nguyên van a");
        persion.setAge (22);
        persion.setEmail (" dai99175@gmail.com");


//         in ra thông in đối tượng.
        System.out.println (persion );
        System.out.println (persion.getName () );

//        tạo thoong tin  full tham số
        Persion persion1= new Persion ( 2," trâm van B",32," DAI 0904@" );

//        Iin ra đối tượng

        System.out.println (persion1 );
        System.out.println (persion1.getName () );

        persion1.setAge (40);
        System.out.println (persion1 );

    }


}
