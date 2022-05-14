package sevice;

import model.Product;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ProductSevice {
//    khởi tạo list sản phẩm
    ArrayList<Product> products;
//    khởi tạo mảng
    public  ProductSevice (){
        init();
    }
//    khởi tạo data
    public void init(){
        products=new ArrayList<> ();
        products.add (new Product ( 1,"Bánh quy","sản phâm trẻ em",1,120000 ));
        products.add (new Product ( 2,"Cà phê","sản phâm người lớn",6,80000 ));
        products.add (new Product ( 3,"Kẹo","sản phâm người lớn",2,70000 ));
        products.add (new Product ( 4,"Sữa chưa","sản phâm trẻ em và người lớn",4,122000 ));
        products.add (new Product ( 5,"Thạch rau cầu","sản phâm trẻ em và người lớn",5,190000 ));

    }
//    Trả về danh sách
    public ArrayList<Product> getProducts(){
        return products;
    }
//    In ra thông tin
    public void printInfo(ArrayList<Product>list){
        for (Product product: list){
            System.out.println (product );
        }
    }
//    Tìm sản phẩm theo tên
    public ArrayList<Product> findByname(String name){
        ArrayList< Product> list= new ArrayList<> ();
        for (Product e: products){
            if (e.getName ().toLowerCase ().contains (name.toLowerCase ())){
                list.add (e);
            }

        }
        return list;
    }
//    Tìm kiếm sản phẩm theo id
    public Product findById(int id){
        for (Product e: products){
            if (e.getId ()==id){
                return e;
            }
        }
        return null;
    }
    public void deleteProduct(int id) {
        // TODO : Test forEach để xóa
        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            Product product = iterator.next();
            if(product.getId() == id) {
                iterator.remove();
            }
        }
    }

    public Product updateQuality(Product product){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong moi: ");
        int newQuantity = sc.nextInt();
        product.setQuantity (newQuantity);
        return product;
    }

//    Tìm kiếm sản phẩm có số lượnh dưới 5
    public ArrayList<Product> findQuantity(){
        ArrayList<Product> list= new ArrayList<> ();
        for (Product e:products){
            if (e.getQuantity ()<5){
                list.add (e);
            }
        }
        return list;
    }
    public ArrayList<Product> findPrice50() {
        ArrayList<Product> list = new ArrayList<> ( );
        for (Product product : products) {
            if (product.getPrice ( ) < 50000) {
                list.add (product);
            }
        }
        return list;
    }
    public ArrayList<Product> findPrice50to100(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getPrice () >= 50000 && product.getPrice ()<=100000){
                list.add(product);
            }
        }
        return list;
    }
    public ArrayList<Product> findPrice100(){
        ArrayList<Product> list = new ArrayList<>();
        for (Product product:products){
            if(product.getPrice () > 100000){
                list.add(product);
            }
        }
        return list;
    }

}


