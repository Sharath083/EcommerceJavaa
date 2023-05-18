package Flipkart;

import java.time.LocalDate;
class OrderClass extends Main {
    public void oderDetails(){
        System.out.println("enter order id");
        int orderId=scanner.nextInt();
        scanner.nextLine();
        LocalDate dateOfPurchase = java.time.LocalDate.now();
        System.out.println("date of purchase  "+dateOfPurchase);


        System.out.println("no.of products u want to order");
        int noOfOrders=scanner.nextInt();
        for(int i=0;i<noOfOrders;i++){
            int o=0;
            System.out.println("enter product id to order");
            int id = scanner.nextInt();
            for (CartPojo cartPojo : cartProductAl) {
                if (cartPojo.customerName.equals(uName)) {
                    if (cartPojo.getProductID() == id) {
                        String collectionOfProducts = cartPojo.getProductName();
                        int price = cartPojo.getPrice();
                        String customerName = uName;
                        Order order = new Order(orderId, collectionOfProducts, dateOfPurchase, price, customerName);//,customerName
                        oderAL.add(order);
                        o++;
                        break;
                    }

                }
            }
            if(o==0){
                System.out.println("the id u entered is not in the cart");
//                i--;
            }
            else {
                System.out.println("order placed");
            }


        }


    }


}
