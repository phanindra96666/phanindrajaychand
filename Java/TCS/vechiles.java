public class vechiles {
    private static void no_ofvech(int v, int w) {
        int res = ((v*4)-w)/2;
        int car = v-res;
        System.out.println("bikes are "+res);
        System.out.print("cars are "+car);
    }
    public static void main(String[] args) {
        int v = 200;
        int w = 540;
        no_ofvech(v,w);
    }
}
