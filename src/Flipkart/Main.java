package Flipkart;

import Flipkart.CartPojo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
    static HashMap<Integer, ProductPojo> productHM=new HashMap<>();
    static ArrayList<CartPojo> cartProductAl=new ArrayList<>();
   // static HashMap<Integer,ProductPojo> cartProductHM=new HashMap<>();
    static Scanner scanner=new Scanner(System.in);
    static ArrayList<Order> oderAL=new ArrayList<>();
    static ArrayList<Customer> customerAL=new ArrayList<>();
    static String uName;
    static int cusID;
    public static void main(String[] args) {

        productHM.put(1,new ProductPojo(1,200,"Cover","plastic","not available"));
        productHM.put(2,new ProductPojo(2,300,"pcCover","plastic","available"));
        productHM.put(3,new ProductPojo(3,400,"AcCover","plastic","available"));
        productHM.put(4,new ProductPojo(4,500,"PhoneCover","plastic","available"));
        productHM.put(5,new ProductPojo(5,600,"CarCover","plastic","available"));



        SwitchClass switchClass=new SwitchClass();

        switchClass.startOperation();


    }
}
//eCommerce.placeOrder();
//        eCommerce.addProduct();
//        eCommerce.removeProduct();
//        outputClass.viewProducts();
//        System.out.println("No.of customers want to shop");
//        int noOfCustomers=scanner.nextInt();
//        for (int i = 1; i <=noOfCustomers; i++) {
//
//            System.out.println("Now customer "+i+"  is shopping");
//            ShoppingCart shoppingCart=new ShoppingCart();
//            shoppingCart.add();
//            shoppingCart.remove();
//            OrderClass orderClass=new OrderClass();
//            orderClass.oderDetails();
//            CustomerClass customerClass=new CustomerClass();
//            customerClass.customerDetails();
//
//
//            cartProductHM.clear();
//
//        }