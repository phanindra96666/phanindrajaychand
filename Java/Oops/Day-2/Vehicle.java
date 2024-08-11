class Vehicle{
    private String name;
    //protected String name; no need to use get set methods 
    public void mymethod(){
        System.out.println("Hello EveryOne");
    }

    public String getName(){
    // when private use in setname fun => setName("phani");
        return name;
    }
    public void setName(String NewName){
        this.name = NewName;
    }
    
}