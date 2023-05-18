package Flipkart;

public class CartPojo{
    private int productID,price;
    private String  productName, description,  availabilityStatus;
    String customerName;

    public int getProductID() {
        return productID;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public String getDescription() {
        return description;
    }

    public String getAvailabilityStatus() {
        return availabilityStatus;
    }



    public CartPojo(String customerName,int productID, int price, String productName, String description, String availabilityStatus ) {
        this.customerName=customerName;
        this.productID = productID;
        this.price = price;
        this.productName = productName;
        this.description = description;
        this.availabilityStatus = availabilityStatus;

    }
}
