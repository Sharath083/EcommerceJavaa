package Flipkart;

class AdministratorCheck extends Main {

    ECommerce eCommerce=new ECommerce();
    public void checkOrders(){


        System.out.println("Does administrator want to see orders of "+"person ");
        Main.scanner.nextLine();
        String view= Main.scanner.nextLine();
        if(view.equalsIgnoreCase("yes")){
            eCommerce.viewOrders();

        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
