public class N15 {
    public static void main(String[] args) {
        int[] array = {4, 5, 6, 4, 7, 4, 5, 5};
        findMode(array);
    }

    public static void findMode(int[] array) {
        int maxCount = 0;

        for (int i = 0; i < array.length; i++) {
            boolean alreadyCounted = false;

            for (int k = 0; k < i; k++) {
                if (array[k] == array[i]) {
                    alreadyCounted = true;
                    break;
                }
            }

            if (!alreadyCounted) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                }
            }
        }
        System.out.print("Mode(s): ");
        for (int i = 0; i < array.length; i++) {
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {
                if (array[k] == array[i]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (!alreadyPrinted) {
                int count = 0;
                for (int j = 0; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                    }
                }

                if (count == maxCount) {
                    System.out.print(array[i] + " ");
                }
            }
        }

        System.out.println(); 
    }
}
