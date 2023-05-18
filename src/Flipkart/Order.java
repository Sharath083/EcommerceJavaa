package Flipkart;

import java.time.LocalDate;
import java.util.Date;

class Order{
    private int orderID;
    private String  collectionOfProducts;
    LocalDate dateOfPurchase;
    String customerName;

    int price;

    public int getOrderID() {
        return orderID;
    }

    public String getCollectionOfProducts() {
        return collectionOfProducts;
    }

    public LocalDate getDateOfPurchase() {
        return dateOfPurchase;
    }


    public int getPrice() {
            return price;
    }
    public String getCustomerName() {
        return customerName;
    }

    public Order(int orderID, String collectionOfProducts, LocalDate dateOfPurchase, int price,String customerName) {
        this.orderID = orderID;
        this.collectionOfProducts = collectionOfProducts;
        this.dateOfPurchase = dateOfPurchase;
        this.price = price;
        this.customerName=customerName;
    }
}