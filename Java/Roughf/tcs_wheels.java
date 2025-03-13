public class tcs_wheels {
    public static void main(String args[]){
        int wheels = 540;
        int vechiles = 200;
        int total_wheels = 200*4;
        int remaning_wheels = (total_wheels-wheels)/2;
        System.out.println("For 2 wheelers :"+remaning_wheels);
        System.out.println("For 4 wheelers :"+(vechiles-remaning_wheels));


    }
}
