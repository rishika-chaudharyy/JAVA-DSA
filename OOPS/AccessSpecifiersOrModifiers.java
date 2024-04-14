//Write a program to demonstrate different access specifiers or modifiers

public class AccessSpecifiersOrModifiers {
    public static void main(String args[]){
        //creating the obejct

        BankAccount myAcc = new BankAccount(); 

        myAcc.username = "RishikaDLHJ"; //can directly access and change
        // myAcc.password="Rishu"; // cannot access , shows error

        System.out.println(myAcc.username);
         
        myAcc.changePassword("Rishu");
        // System.out.println(myAcc.password);//cannot print directly only change


        System.out.println(myAcc.getPassword()); //function to print the password
    }
}


class BankAccount{

   protected String username; //this is protected 

   private String password; //this is private , we cannot directly access it , we need to create some methods to change it or see it

   public void changePassword(String newPassword){ //updating password , here we can access password as it is private and can be accessed in the same class
    password = newPassword;
   }

   public String getPassword(){
    return this.password;
   }
}