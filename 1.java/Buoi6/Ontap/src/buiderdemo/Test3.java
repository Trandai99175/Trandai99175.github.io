package buiderdemo;

public class Test3 {
    public static void main(String[] args) {
        Persion persion = Persion.buider ()
                .withName (" Nhuyen van A")
                .withAge (32)
                .build ();
        System.out.println (persion );

    }
}
