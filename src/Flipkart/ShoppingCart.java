package Flipkart;

import Flipkart.CartPojo;
import Flipkart.Main;
import Flipkart.OutputClass;

class ShoppingCart extends Main {
    OutputClass outputClass=new OutputClass();
    public void add(){
        System.out.println("enter no.of elements do you want to add to cart (USER)");
        int noOfProducts= scanner.nextInt();
        for(int i=0;i<noOfProducts;i++) {
            System.out.println("Enter product ID");
            int key= scanner.nextInt();
            if(productHM.containsKey(key)){
                if(productHM.get(key).getAvailabilityStatus().equals("available")){
                    String customerName=uName;
                    int productID=productHM.get(key).getProductID();
                    int price=productHM.get(key).getPrice();
                    String  productName=productHM.get(key).getProductName();
                    String description=productHM.get(key).getDescription();
                    String availabilityStatus=productHM.get(key).getAvailabilityStatus();
                    CartPojo cartPojo=new  CartPojo( customerName,productID,  price,  productName,  description,  availabilityStatus );
                    cartProductAl.add(cartPojo);
                }
                else{
                    System.out.println("the product is out of stock");
                    System.out.println("choose another product");
                    i--;
                }

            }
            else{
                System.out.println("we do not have a product with this ID "+key);
                i--;
            }
        }
        System.out.println("Your Current Cart    (USER)");

        outputClass.viewCartProducts();
    }
    public void remove(){


        System.out.println("Enter the No Of Products  to be removed   (USER)");
        int noOfProductsRemoved= scanner.nextInt();
        for(int i=1;i<=noOfProductsRemoved;i++) {
            System.out.println("Enter product ID");
            int key = scanner.nextInt();
            int a=0;
            for (CartPojo  p : cartProductAl) {
                if (p.getProductID() == key) {
                    System.out.println(p.getProductID());
                    cartProductAl.remove(p);
                    a++;
                    break;

                }
            }
            if(a==0){
                System.out.println("Wrong id");
                i--;
            }
            else{
                System.out.println("Removed!");
            }
        }
    }


}