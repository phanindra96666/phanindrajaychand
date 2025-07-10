interface I1 {
    abstract void m1();
    abstract void m2();
    public static void main(String[] args) {
        I1 obj = new I1() {
            @Override
            public void m1(){
                System.out.println("Hii");
            }
            @Override
            public void m2(){
                System.out.println("Hello");
            }
        };
        obj.m1();
        obj.m2();
    }
}