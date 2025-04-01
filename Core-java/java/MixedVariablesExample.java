public class MixedVariablesExample {
    static int staticVariable = 40;
    int nonStaticVariable = 50;
    public static void main(String[] args) {
        int localVariable = 60;
        MixedVariablesExample obj = new MixedVariablesExample();
        System.out.println("The value of the static variable is: " + staticVariable);
        System.out.println("The value of the non-static variable is: " + obj.nonStaticVariable);
        System.out.println("The value of the local variable is: " + localVariable);
    }
}