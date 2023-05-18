package Flipkart;

import Flipkart.FeaturesSwitchClass;

class Login extends Main {
    FeaturesSwitchClass featuresSwitchClass=new FeaturesSwitchClass();
    public void verify() {
        Validate v=new Validate();

        System.out.println("enter  user name (length>4)");
        Main.scanner.nextLine();
        Main.uName= Main.scanner.nextLine();
        System.out.println("Enter customerID");
        Main.cusID= Main.scanner.nextInt();
        Main.scanner.nextLine();
        String userName= Main.uName.replace(" ","");
        if(!v.nameValidation(userName)) {
            System.out.println("Wrong UserName given !, try with a different UserName");
        }
        else {
            System.out.println("enter password (length>7)");
            String pass = Main.scanner.nextLine();
            if (pass.contains(" ") || !v.passwordValidation(pass)) {
                System.out.println("Wrong Password given !, try with a different Password");
            } else {
                featuresSwitchClass.customerFeatures();

            }
        }


    }
}