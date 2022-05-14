package demoArraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class DemoArraylistMethol {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<> ();
        names.add ("Hieen");
        names.add ("dai");
        names.add ("khanh");
        System.out.println (Arrays.toString (names.toArray ()));

//        them ten vao 1 vi tri
        names.add (1,"an" ) ;
        System.out.println (Arrays.toString (names.toArray ()));

//        lay size
        System.out.println (names.size () );

//        xoá 1 vi trí chỉ định

        names.remove (1);
        System.out.println (Arrays.toString (names.toArray ()));


//        tạo 1 aray khac
        ArrayList<String> namesOther= new ArrayList<> ();
        namesOther.add ("quỳnh");
        namesOther.add ("hùng");
        names.addAll (namesOther);
        System.out.println (Arrays.toString (names.toArray ()));
    }


}
