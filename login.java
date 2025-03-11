public class login {
    private String id ;
    private String password;

    login (String id , String password){
        this.id=id;
        this.password=password;
    }

    boolean checkCredential(){
     if(this.id == "" && this.password == ""){
        return true;
     }   
     else{
        return false;
     }
    }
}
