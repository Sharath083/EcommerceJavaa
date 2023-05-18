package Flipkart;

class CustomerClass extends Main {
    public void customerDetails() {


        int customerID = cusID;
        String customerName = uName;
        System.out.println("customer Name  "+uName);
        System.out.println("customer id  "+cusID );
        for (CartPojo details : cartProductAl) {

            String collectionOfProducts = details.getProductName();
            Customer customer = new Customer(customerID, customerName, collectionOfProducts);
            customerAL.add(customer);

        }





    }
}
