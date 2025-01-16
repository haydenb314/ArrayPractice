public class Main {
    public static void main(String[] args) {

        //first problem
        int[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : iArray) {
            System.out.print(i + ", ");
        }

        //second problem
        System.out.println("\n");
        String[] sArray = {"Abby", "Becky", "Bethany", "Anthony", "Bob"};
        for (String s : sArray) {
            if (!s.startsWith("A")) {
                System.out.print(s + ", ");
            }
        }

        //third problem
        System.out.println("\n");
        int[] randomNums = new int[10];
        int currentRandNum;
        for (int i = 0; i < 10; i++) {
            currentRandNum = (int) (Math.random() * 10) + 1;
            randomNums[i] = currentRandNum;
        }

        System.out.println("Randomly generated array:");
        for (int i : randomNums) {
            System.out.print(i + ", ");
        }

        int count = 0;

        for (int i = 0; i < 10; i++) {
            if (randomNums[i] >= 4 && randomNums[i] <= 10) {
                count++;
            }
        }

        int[] inRangeNums = new int[count];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            if (randomNums[i] >= 4 && randomNums[i] <= 10) {
                inRangeNums[index++] = randomNums[i];
            }
        }

        System.out.println("\n\nIn range array:");
        for (int i : inRangeNums) {
            System.out.print(i + ", ");
        }





    }
}