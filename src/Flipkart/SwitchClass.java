package Flipkart;

import Flipkart.*;

class SwitchClass extends Main {
    //                    System.out.println("No.of customers want to shop");
//                    int noOfCustomers = scanner.nextInt();
    //for (int i = 1; i <= noOfCustomers; i++) {
    public void startOperation(){
        AdministratorCheck administratorCheck=new AdministratorCheck();
        OutputClass outputClass=new OutputClass();
        ECommerce eCommerce=new ECommerce();

        // outputClass.viewProducts();
        int continues;
        do{
            System.out.println("1--> customer   2-->Administrator  ");
            int person= scanner.nextInt();
            switch (person) {
                case 1 -> {

                    Login login=new Login();
                    login.verify();
                    System.out.println("your orders");
                    outputClass.viewOrderAL();


                }
                case 2 -> {
                    int i;
                    do {
                        System.out.println("1-->addProduct  2-->removeProduct  3-->viewProducts  4--->to View orders   5--> view customer details");
                        int choice = scanner.nextInt();
                        switch (choice) {
                            case 1 ->
                                eCommerce.addProduct();
                            case 2 ->
                                eCommerce.removeProduct();
                            case 3 ->
                                outputClass.viewProducts();
                            case 4-> {
                                if(customerAL.isEmpty()&&oderAL.isEmpty()){
                                    System.out.println("currently there are no orders");
                                }
                                else{
                                    administratorCheck.checkOrders();
                                }
                            }
                            case 5->outputClass.viewCustomerAL();
                            default -> System.out.println("Enter a valid choice");
                        }
                        System.out.println("Enter 1 to Continue 2---> Logout");
                        i=scanner.nextInt();
                    }while(i==1);


                }

                default -> System.out.println("enter a valid choice");
            }
            System.out.println(" press 1 to choose between customer and administrator 2--> Logout");
            continues=scanner.nextInt();
        }while(continues==1);



    }
}

//                    System.out.println("Now customer  is shopping");
//                    ShoppingCart shoppingCart = new ShoppingCart();
//                    shoppingCart.add();
//                    shoppingCart.remove();
//                    OrderClass orderClass = new OrderClass();
//                    orderClass.oderDetails();
//                    CustomerClass customerClass = new CustomerClass();
//                    customerClass.customerDetails();




//cartProductHM.clear();


//}