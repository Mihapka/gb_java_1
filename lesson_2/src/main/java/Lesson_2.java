public class Lesson_2 {

    public static void main(String[] args) {

//        first task
        System.out.println("first task");
        System.out.println("Было:");
        int[] firstTaskArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a : firstTaskArray) {
            System.out.print(" " + a);
        }
        System.out.println("\n");
        for (int i = 0; i < firstTaskArray.length; i++) {
            if (firstTaskArray[i] == 1) {
                firstTaskArray[i] = 0;
            } else {
                firstTaskArray[i] = 1;
            }
        }
        System.out.println("Стало:");
        for (int a : firstTaskArray) {
            System.out.print(" " + a);

        }
        System.out.println(" ");

//     second task
        System.out.println("\n");
        System.out.println("second task");
        int[] secondTaskArray = new int[8];
        for (int i = 0; i < secondTaskArray.length; i++) {
            secondTaskArray[i] = i * 3;
        }
        for (int a : secondTaskArray) {
            System.out.print(" " + a);

        }
        System.out.println(" ");

//        third task
        System.out.println("\n");
        System.out.println("third task");
        int[] thirdTaskArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Было:");
        for (int a : thirdTaskArray) {
            System.out.print(" " + a);
        }
        System.out.println("\n");
        for (int i = 0; i < thirdTaskArray.length; i++) {
            if (thirdTaskArray[i] > 6) {
                thirdTaskArray[i] *= 6;
            }

        }
        System.out.println("Стало:");
        for (int a : thirdTaskArray) {
            System.out.print(" " + a);
        }
        System.out.println(" ");

//        fourth task

        System.out.println("\n");
        System.out.println("fourth task");
        int[][] fourthTaskTwoD = new int[4][4];
        int position = fourthTaskTwoD.length - 1;
        for (int i = 0; i < fourthTaskTwoD.length; i++) {
            fourthTaskTwoD[i][i] = 1;
            fourthTaskTwoD[i][position] = 1;
            position--;
        }

        for (int i = 0; i < fourthTaskTwoD.length; i++) {
            for (int j = 0; j < fourthTaskTwoD.length; j++)
                System.out.print(fourthTaskTwoD[i][j] + "     ");
            System.out.println(" ");
        }

//        fifth task

        System.out.println("\n");
        System.out.println("fifth task");
        int[] fifthTaskArray = {1, 5, 3, 2, 11, 400, 5, 2, 4, 8, 9, -1};

        System.out.println(searchExtrema(fifthTaskArray));
        System.out.println("\n");

//        sixth task

        System.out.println("sixth task");
        int[] sixthTaskArray = new int[]{2, 2, 2, 1, 2, 2, 10, 1};

        System.out.println(checkBalance(sixthTaskArray));

//        seventh task

        System.out.println("\n");
        System.out.println("seventh task");
        int[] seventhTaskArray = {1, 5, 3, 2, 11, 400, 5, 2, 4, 8, 9, -1};
        System.out.println("Было:");
        for (int a : seventhTaskArray) {
            System.out.print(a);
            System.out.print(" ");
        }
        System.out.println("\n");

        positionOffset(seventhTaskArray, -2);


    }

    public static String searchExtrema(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }
            if (max < array[i]) {
                max = array[i];

            }
        }
        return ("Минимальное значение: " + " " + min + " " + "\n" + "Максимальное значение: " + max);
    }


    public static boolean checkBalance(int[] array) {
        int firstNum = 0;
        int secondNum = 0;
        int score = 0;

        for (int i = 0; i < array.length; i++) {
            firstNum += array[i];
            score++;
            for (int j = score; j < array.length; j++) {
                secondNum += array[j];
            }
//            System.out.println(firstNum + " " + secondNum);
//            System.out.println(firstNum - secondNum);
            secondNum = 0;
        }
        return true;
    }

    //
    public static void positionOffset(int[] array, int displacementFactor) {


        if (displacementFactor > 0) {
            for (int i = 0; i < displacementFactor; i++) {
                int temp = array[0];
                for (int j = 1; j < array.length; j++) {
                    array[j - 1] = array[j];
                }
                array[array.length - 1] = temp;
            }
            System.out.println("Стало:");
            for (int a : array) {
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println("\n");
        } else {
            for (int i = 0; i < displacementFactor * -1; i++) {
                int temp = array[array.length - 1];
                for (int j = 1; j < array.length; j++) {
                    array[array.length - j] = array[array.length - (j + 1)];
                }
                array[i] = temp;
            }
            System.out.println("Стало:");
            for (int a : array) {
                System.out.print(a);
                System.out.print(" ");
            }
            System.out.println("\n");

        }
    }
}