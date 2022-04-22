import org.w3c.dom.Text;

public class String1 {
    public static void main(String[] args) {

// Khai báo theo kiểu literal (giá trị thể hiển chính nó)
        String name = "Bùi Hiên";
        String name1 = "Bùi Hiên";

        // Khởi tạo = từ khóa new -> Sinh ra đối tượng
        String message = new String("Xin chào");
        String message1 = new String("Xin chào");

        System.out.println(name);
        System.out.println(message);

        // == thường được sử dụng cho kiểu dữ liệu nguyên thủy
        System.out.println(name == name1);
        System.out.println(message == message1);

        // equals so sánh về mặt ký tự
        System.out.println(name.equals(name1));
        System.out.println(message.equals(message1));



        String text=" xin chao cac ban";
        System.out.println("in hoa chữ:"+ text.toUpperCase());
        System.out.println(" in hoa chữ thuong:"+ text.toLowerCase());
        System.out.println(" Độ dài ký tự"+ text.length());
        System.out.println(" ký tự đầu tiên choãi:"+ text.charAt(0));
        System.out.printf(" cắt choãi chào các bạn:"+text.substring(4));
    }

    }
