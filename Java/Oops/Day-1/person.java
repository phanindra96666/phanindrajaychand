public class person {
    private String name;

    private void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        setName("phanii");
        return name;
    }
    
}
