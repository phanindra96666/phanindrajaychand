public class N7 {
    public static void main(String[] args) {
        int[] a = {3, 6, 2, 8};
        int[] b = {10, 20, 30};
        int[] merged = new int[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[a.length + i] = b[i];
        }

        System.out.print("Merged Array: ");
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");
        }
    }
}
