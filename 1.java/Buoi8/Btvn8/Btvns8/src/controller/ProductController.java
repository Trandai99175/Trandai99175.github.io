package controller;

import model.Product;
import sevice.ProductSevice;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    //    Toạ đối tượng từ ProductSevice
    private final ProductSevice productSevice = new ProductSevice ( );

    public void run() {
        Scanner sc = new Scanner (System.in);
        boolean isContinue = true;
        int option = 0;
        while (isContinue) {
            printMenu ( );

            System.out.println (" nhập lựa chọn:");
            option = Integer.parseInt (sc.nextLine ( ));
            switch (option) {
                case 1: {
                    ArrayList<Product> products = productSevice.getProducts ( );
                    if (products.isEmpty ( )) {
                        System.out.println (" không có sản phẩm nào trong danh sách");

                    } else {
                        System.out.println (" Danh sách sản phầm:");
                        productSevice.printInfo (products);
                    }
                    break;
                }
                case 2: {
                    System.out.println ("nhập tên cần tìm:");
                    String name = sc.nextLine ( );
                    ArrayList list = productSevice.findByname (name);
                    if (list != null) {
                        productSevice.printInfo (list);
                    } else {
                        System.out.println ("không tìm thấy sản phẩm");
                    }
                    break;

                }
                case 3: {
                    System.out.println ("Tìm sản phẩm theo id");
                    System.out.print ("Nhập id sản phẩm cần tìm: ");
                    int id = Integer.parseInt (sc.nextLine ( ));
                    Product product = productSevice.findById (id);
                    if (product == null) {
                        System.out.println ("không tìm thấy sản phẩm ");
                    } else {
                        System.out.println (product);
                        boolean isContinueSub = true;
                        int vong1;
                        while (isContinueSub) {
                            System.out.println ("1. Xoá sản phẩm ");
                            System.out.println ("2. Cập nhật số lượng ");
                            System.out.println ("3. Thoát");
                            System.out.print ("Nhập lựa chọn: ");
                            vong1 = Integer.parseInt (sc.nextLine ( ));
                            switch (vong1) {
                                case 1: {
                                    productSevice.deleteProduct (product.getId ( ));
                                    System.out.println ("xoá thành công ");
                                    isContinueSub = false;
                                    break;
                                }
                                case 2: {
                                    System.out.println ("Cập nhật số lượng sản phẩm ");
                                    Product product1 = productSevice.updateQuality (product);
                                    System.out.println ("Sản phẩm được cập nhật số lượng");
                                    System.out.println (product1);
                                    break;
                                }
                                case 3: {
                                    isContinueSub = false;
                                    break;
                                }
                                default: {
                                    System.out.println ("Lựa chọn không phù hợp");
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 4: {
                    System.out.println ("Ds sản phẩm số lượng ít hơn 5");
                    ArrayList<Product> list = productSevice.findQuantity ( );
                    productSevice.printInfo (list);
                    break;
                }
                case 5: {
                    System.out.println ("Tìm sản phẩm theo mức giá");
                    boolean isContinueSub = true;
                    int vong2;
                    while (isContinueSub) {
                        System.out.println ("1. Tìm sản phẩm dưới 50000");
                        System.out.println ("2. Tìm sản phẩm từ 50.000 đến 100.000");
                        System.out.println ("3. Tìm sản phẩm trên 100000");
                        System.out.println ("4. Thoát");
                        System.out.print ("Nhập lựa chọn: ");
                        vong2 = Integer.parseInt (sc.nextLine ( ));
                        switch (vong2) {
                            case 1: {
                                System.out.println ("DS sản phẩm dưới 50000");
                                ArrayList<Product> list = productSevice.findPrice50 ( );
                                productSevice.printInfo (list);
                                break;
                            }
                            case 2: {
                                System.out.println ("DS sản phẩm từ 50000 đến 100000");
                                ArrayList<Product> list = productSevice.findPrice50to100 ( );
                                if (list.isEmpty ( )) {
                                    System.out.println ("Không có sản phẩm phù hợp");
                                } else {
                                    productSevice.printInfo (list);
                                }
                                break;
                            }
                            case 3: {
                                System.out.println ("DS Sản phẩm trên 100000");
                                ArrayList<Product> list = productSevice.findPrice100 ( );
                                if (list.isEmpty ( )) {
                                    System.out.println ("Không có sản phẩm phù hợp");
                                } else {
                                    productSevice.printInfo (list);
                                }
                                break;
                            }
                            case 4: {
                                isContinueSub = false;
                                System.out.println ("Thoát khỏi");
                                break;
                            }
                            default: {
                                System.out.println ("Luạ chọn không phù hợp");
                                break;
                            }
                        }
                    }
                    break;
                }
                case 6: {
                    isContinue = false;
                    System.out.println ("Thoát ");
                    break;
                }
                default: {
                    System.out.println ("Lựa chọn không phù hợp");
                    break;
                }

            }
        }
    }
            private void printMenu () {
                System.out.println ("\n*********** MENU ***********");
                System.out.println ("1. Xem danh sách sản phẩm");
                System.out.println ("2. Tim sản phẩm theo tên");
                System.out.println ("3. Tim sản phẩm theo id");
                System.out.println ("4. Tim sản phẩm có số lượng dưới 5");
                System.out.println ("5. Tim sản phẩm theo giá");
                System.out.println ("6. Thoát");
            }


        }

