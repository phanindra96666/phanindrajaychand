class Gmail{
	String username = "cvcorp";
	private int password = 12345;
	void setPassword(int password){
		this.password = password;
	}
	int getPassword(){
		return password;
	}
}
class user{
	public static void main(String[] args){
		Gmail obj = new Gmail();
		obj.setPassword(123);
		System.out.print(obj.getPassword());
	}
}
