public class J033{
	int a = 11;
	J033(int a){

	}

	J033(J033 obj){
	     obj.x;
	}

	public static void main(String[] args){
		J033 obj = new J033(10);
		J033 x = new J033(obj);
		obj.x;
	}
}