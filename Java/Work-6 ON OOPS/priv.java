class bank{
    public String username;
    private String banknumber;
    private String password;

    public String getnumber(){ 
        return this.banknumber;
    }
    public void setnumber(String number){
        this.banknumber = number;
    }

    public String getPassword(){
        setPassword("1234");
        return this.password;
    }
    private void setPassword(String newpassword){
        this.password = newpassword;
    }
}
public class priv {
    public static void main(String[] args) {
       bank myObj = new bank();
       myObj.username = "Phani";
       myObj.setnumber("28767883393");
       System.out.println(myObj.username);
       System.out.println(myObj.getnumber());
       System.out.println(myObj.getPassword());
    }
}
