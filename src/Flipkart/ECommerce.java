package Flipkart;

class ECommerce extends Main {

    OutputClass outputClass=new OutputClass();
    public void addProduct(){

        outputClass.viewProducts();

        System.out.println("enter no.of products do you want to order   (Ecommerce)");

        int placeOrder= Main.scanner.nextInt();


        for(int i=0;i<placeOrder;i++){

            System.out.println("Enter id of product");
            int key= Main.scanner.nextInt();
            if(Main.productHM.containsKey(key)){
                System.out.println("we already have product with this ID "+key);
                i--;
            }
            else{
                int productID=key;
                System.out.println("Enter price");
                int price= Main.scanner.nextInt();
                Main.scanner.nextLine();
                System.out.println("name");
                String productName= Main.scanner.nextLine();
                System.out.println("description");
                String description= Main.scanner.nextLine();
                System.out.println("availabilityStatus");
                String availabilityStatus= Main.scanner.nextLine();
                ProductPojo productPojo=new ProductPojo(productID, price, productName, description,  availabilityStatus);
                Main.productHM.put(key,productPojo);

            }

        }

    }
    public void removeProduct(){
        outputClass.viewProducts();
        System.out.println("Enter the No Of Products  to be removed (Ecommerce)");
        int noOfProductsRemoved= Main.scanner.nextInt();
        for(int i=0;i<noOfProductsRemoved;i++) {
            System.out.println("Enter product ID");
            int key= Main.scanner.nextInt();
            Main.productHM.remove(key);
        }


    }


    public void viewOrders(){
        System.out.println("Administrator is viewing orders");
        outputClass.allOrders();

    }
}
