public class Method {
    public Method() {
    }

    public static void main(String[] args) {
        Method m = new Method();
        m.sayHello();
        m.sayHelloWithName("Bùi Hiên");
        m.sayHelloWithName("Nguyễn Văn A");
        int data = m.sum(10, 20);
        System.out.println(data);
        int data1 = m.sum(data, 70);
        System.out.println(data1);
        System.out.println(m.sum(3, 4));
    }

    public void sayHello() {
        System.out.println("Xin chào các bạn");
    }

    public void sayHelloWithName(String name) {
        System.out.println("Xin chào " + name);
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
