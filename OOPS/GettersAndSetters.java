//Write a program to create getter and setter function for private attribute

public class GettersAndSetters {
    public static void main(String args[]) {
        // creating an object
        Mobile iphone = new Mobile();

        iphone.setPassword("RishuDhaivu");
        System.out.println(iphone.getPassword());
    }
}

class Mobile {
    public String model;
    private String password; // this is private

    // setter to set the private attribute value
    void setPassword(String newPassword) {
        password = newPassword;
    }

    // getter to get the private attribute value
    String getPassword() {
        return this.password;
    }
}