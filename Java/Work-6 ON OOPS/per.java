public class per {
    private String userName;//private username
    private String passWord;//private password

    public String getuserName(){
        return userName;
    }
    public String getpassWord(){
        return passWord;
    }

    public void setuserName(String newName){
        this.userName = newName;
    }
    public void setpassWord(String newpass){
        this.passWord = newpass;
    }
    public static void main(String[] args){
        per pers1 = new per();
        pers1.userName = "Phni";
        pers1.passWord = "1345";
        System.out.println(pers1.userName);
        System.out.println(pers1.passWord);
    }
}