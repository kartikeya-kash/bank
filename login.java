/* stucture of LOGIN
 * 
 *    input id and password
 *    Login button
 *    forgot password?
 *    Register
 * 
 */

public class login {
    private String id ;
    private String password;

    login (String id , String password){
        this.id=id;
        this.password=password;
    }

    private void getDataFromDataBase(){
        
    }

    boolean checkCredential(){
     if(this.id == "" && this.password == ""){
        return true; //go to register page 
     }   
     else{
        return false; //give error
     }
    }

    
}
