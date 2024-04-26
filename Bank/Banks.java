package Bank;

 class Account{
    public String names;
    protected String email;
    private String password;

     //getters & setters: to use private data outside the class
     public  String getPassword(){
         return  this.password;
     }

     public  void  setPassword(String pass){
         this.password=pass;
     }
}



public class Banks {
    public static void main(String args[]){
        Account account1=new Account();
        account1.names="Shashi Prabha";
        account1.email="sp@gmail.com";
        //account1.password="abcd"; //shows error as it is private

        account1.setPassword("abc");
        System.out.println(account1.getPassword());
    }
}
//access modifiers
//private, protected,public,default

//encapsulation : data hiding => using access modifiers
//abstractions: show only useful data and hide rest of the data