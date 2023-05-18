package Flipkart;

public class FeaturesSwitchClass extends Main {
    OutputClass outputClass=new OutputClass();

    ShoppingCart shoppingCart = new ShoppingCart();
    OrderClass orderClass = new OrderClass();
    CustomerClass customerClass = new CustomerClass();
    public void customerFeatures(){
        System.out.println("Hey You Logged in SuccessFully");
        System.out.println("Now customer  "+ Main.uName+"  is shopping");
        int customerAgain;
        do{
            System.out.println("1--> add product to cart  2--> remove  3--> view order  ");
            int customerChoice= Main.scanner.nextInt();
            switch (customerChoice) {
                case 1 -> {
                    outputClass.viewProducts();
                    shoppingCart.add();
                }
                case 2 -> {
                    shoppingCart.remove();
                    outputClass.viewCartProducts();
                }
                case 3 -> {

                        orderClass.oderDetails();
                        customerClass.customerDetails();

                }
                default -> System.out.println("Enter a valid choice");
            }

            System.out.println("Enter 0 to choose between customer features    1---> Logout");
            customerAgain= Main.scanner.nextInt();

        }while(customerAgain==0);





    }

}
