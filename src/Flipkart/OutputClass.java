package Flipkart;



import java.util.HashMap ;

public class OutputClass  extends Main {
    public void viewProducts(){
        for( HashMap.Entry<Integer, ProductPojo> details:productHM.entrySet()) {
            System.out.println("ID: "+ details.getValue().getProductID() +"  Price: "+ details.getValue().getPrice() +" "
                    +"  productName: "+ details.getValue().getProductName() +"  description: "+
                    details.getValue().getDescription() +"   availabilityStatus:   "+ details.getValue().getAvailabilityStatus());

        }

    }
    public void viewCartProducts(){
        for (CartPojo details : cartProductAl) {
            if(details.customerName.equals(uName)){
                System.out.println("(USER)  "+"ID: "+ details.getProductID() +"  Price: "+ details.getPrice() +" "
                        +"  productName: "+ details.getProductName() +"  description: "+
                        details.getDescription() +"   availabilityStatus:   "+ details.getAvailabilityStatus());

            }


        }
    }
    public void viewOrderAL(){
        for (Order order : oderAL) {
            if(order.customerName.equals(uName)){

                System.out.println("name : "+order.customerName+"  orderId : " + order.getOrderID() + "  dateOfPurchase : " + order.getDateOfPurchase()
                        + " collectionOfProducts : " + order.getCollectionOfProducts()+"  Price : "+order.getPrice());
                System.out.println();
                //viewCustomerAL();

            }


        }
    }
    public void viewCustomerAL(){
        if(customerAL.isEmpty()){
            System.out.println("there are no customers");
        }
        else{
            for (Customer customer : customerAL) {
                if(customer.getCustomerName().equals(uName)){
                    System.out.println("customerID " + customer.getCustomerID() + "  customerName  " + customer.getCustomerName()
                            + " collectionOfProducts " + customer.getCollectionOfProducts());
                }
            }

        }


    }
    public  void allOrders(){
        for (Order order : oderAL){
            System.out.println("name  : "+order.getCustomerName()+"  orderId ; " + order.getOrderID() + "  dateOfPurchase : " + order.getDateOfPurchase()
                    + " collectionOfProducts : " + order.getCollectionOfProducts()+"  Price : "+order.getPrice());

        }
//        for (Customer customer : customerAL) {
//            System.out.println("customerID " + customer.getCustomerID() + "  customerName  " + customer.getCustomerName()
//                    + " collectionOfProducts " + customer.getCollectionOfProducts());
//
//        }

    }

}
