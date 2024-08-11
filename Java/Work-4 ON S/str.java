public class str {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello My Name Is Phani");
        sb.replace(0,5,"Phani");
        sb.insert(0, "Java ");
        sb.delete(0, 5);
       // sb.reverse();
        System.out.println(sb.charAt(0));

        System.out.println(sb);
    }
}
