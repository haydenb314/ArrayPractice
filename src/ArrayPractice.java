import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {

        int[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("original array:");
        System.out.println(Arrays.toString(iArray));

        System.out.println("\nreversed array:");
        System.out.println(Arrays.toString(reverseArray(iArray)));

        System.out.println("\nshifted array:");
        System.out.println(Arrays.toString(shiftArray(iArray)));

        System.out.println("\nrandom array:");
        int[] randomArray = new int[10];
        for (int i = 0; i < 10; i++) {
            randomArray[i] = (int) (Math.random() * 26) +1;
        }

        System.out.println(Arrays.toString(randomArray));

        System.out.println("secret message: " + convertToString(randomArray));
    }

    //first problem
    public static int[] reverseArray(int[] iArray) {
        int[] reversedArray = new int[iArray.length];
        int index = 0;
        for (int i = iArray.length - 1; i >= 0; i--) {
            reversedArray[index++] = iArray[i];
        }
        return reversedArray;
    }

    //second problem
    public static int[] shiftArray(int[] iArray) {
        int[] shiftArray = new int[iArray.length];
        shiftArray[0] = iArray[iArray.length - 1];
        int index = 1;
        for (int i = 0; i < iArray.length - 1; i++) {
            shiftArray[index++] = iArray[i];
        }
        return shiftArray;
    }

    //third problem
    public static String convertToString(int[] iArray) {
        String message = "";
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        for (int i = 0; i < iArray.length; i++) {
            message += alphabet[iArray[i] - 1];
        }
        return message;
    }

}
