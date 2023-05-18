package Flipkart;

class Validate {
    public boolean nameValidation(String userName) {
        return userName.length() > 4;
    }
    public boolean passwordValidation(String pass) {
        return pass.length() > 7;

    }
}