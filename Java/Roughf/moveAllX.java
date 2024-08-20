public class moveAllX {
    public static void moveall(String str, int idx ,int count , String newString){
       if (idx==str.length()) {
            for(int i=0;i<count;i++){
                newString+='x';
            }
            System.out.println(newString);
            return;
       }
       char curChar = str.charAt(idx);
       if (curChar == 'x'){
            count++;
            moveall(str, idx+1, count, newString);
       }
       else{
        newString+=str.charAt(idx);
        moveall(str, idx+1, count, newString);
       }
    }
    public static void main(String args[]){
        moveall("axbcxxd", 0, 0,"");
    }
}