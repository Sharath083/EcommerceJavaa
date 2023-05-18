package Flipkart;

class Customer{
    private int customerID;
    private String customerName;
    private String collectionOfProducts;
    public int getCustomerID() {
        return customerID;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCollectionOfProducts() {
        return collectionOfProducts;
    }
    public Customer(int customerID, String customerName, String collectionOfProducts) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.collectionOfProducts = collectionOfProducts;
    }
}