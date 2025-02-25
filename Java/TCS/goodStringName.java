import java.util.Arrays;
import java.util.Scanner;

public class goodStringName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String goodString = "(@HR*i{kcQl";
        String name = "Vyom";
        int[] goodChars = goodString.chars().distinct().toArray();
        Arrays.sort(goodChars); 

        int totalDistance = 0;
        int previousGoodChar = goodChars[0]; 

        for (char currentChar : name.toCharArray()) {
            if (goodString.indexOf(currentChar) != -1) {
                previousGoodChar = currentChar; 
                continue;
            }

            int closestDistance = Integer.MAX_VALUE;
            int selectedGoodChar = -1;

            for (int goodChar : goodChars) {
                int distance = Math.abs(goodChar - currentChar);

                if (distance < closestDistance){
                    closestDistance = distance;
                    selectedGoodChar = goodChar;
                } else if (distance == closestDistance) {
                    int currentPrevDistance = Math.abs(previousGoodChar - selectedGoodChar);
                    int newPrevDistance = Math.abs(previousGoodChar - goodChar);

                    if (newPrevDistance < currentPrevDistance) {
                        selectedGoodChar = goodChar;
                    }
                }
            }
            totalDistance += closestDistance;
            previousGoodChar = selectedGoodChar;
        }
        System.out.println(totalDistance);
        scanner.close();
    }
}
