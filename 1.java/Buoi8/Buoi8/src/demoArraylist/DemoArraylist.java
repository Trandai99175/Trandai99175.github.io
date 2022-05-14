package demoArraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<> ( );
        numbers.add (1);
        numbers.add (2);
        numbers.add (3);
        numbers.add (4);

//        in ra
//         sử dung for

        for (int i = 0; i < numbers.size ( ); i++) {
            System.out.print (numbers.get (i) + "\t");
        }
        System.out.println ( );
//        su dumg for eche sue dung nhieu
        for (int number : numbers) {
            System.out.print (number+"\t");

        }
        System.out.println ( );

        // 3. Sử dụng Iterator
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+ "\t");
        }
        System.out.println ( );
        // 4. Sử dụng ListIterator
        ListIterator<Integer> listIterator = numbers.listIterator();
        while (listIterator.hasNext()) {
            System.out.print(listIterator.next()+"\t");
        }

    }
}
