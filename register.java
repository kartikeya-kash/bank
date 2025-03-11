/*
   REGISTER page structure 
        userID // auto define
        Fname 
        Lname
        phone 
        email
        dob
        age
 */

public class register {
    private String userId; // auto define and unique
    private String firstName;
    private String lastName;
    private long phoneNo;
    private String emailId;
    private int dob;
    private int age;

    register (String firstName,String lastName,long phoneNo,String emailId,int dob,int age){
        this.userId=generateUserId();
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNo=phoneNo;
        this.emailId=emailId;
        this.dob=dob;
        this.age=age;
    }

   private String generateUserId(){
        String ui = "";
        return ui;
    }

    private void storeDataInDataBase(){
        //...
    }
}
