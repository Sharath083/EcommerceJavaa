package Flipkart;

class ProductPojo{
    private int productID,price;
    private String  productName, description,  availabilityStatus;


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

    public ProductPojo(int productID, int price, String productName, String description, String availabilityStatus) {
        this.productID = productID;
        this.price = price;
        this.productName = productName;
        this.description = description;
        this.availabilityStatus = availabilityStatus;
    }
}