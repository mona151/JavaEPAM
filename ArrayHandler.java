/*
 * ArrayHandler class
 * Contains main functionality for solving few operations with arrays
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 1
 * */

import java.lang.Math; // for Math.random();

public class ArrayHandler {
    private int largestNegativeNumber = -10, largestNegativeNumberIndex;
    private int lesserPositiveNumber = 10, lesserPositiveNumberIndex;
    public int[] doFillArray(int arraySize){
        int[] targetArray = new int[arraySize];
        for (int j = 0; j < targetArray.length; j++) { // Filling JunkArray with random numbers from [-10;10]
            targetArray[j] = (int)((Math.random()*21)-10);
        }
        return(targetArray);
    }
    public void doSwap(int[] ArrayIn) { // Swaps biggest negative and lesser positive numbers in the input array
        System.out.print("\nFirst Task:");
        for (int i = 0; i < ArrayIn.length; i++) {
            if (ArrayIn[i] < 0 && ArrayIn[i] > largestNegativeNumber) {
                largestNegativeNumber = ArrayIn[i];
                largestNegativeNumberIndex = i;
            }
            if (ArrayIn[i] > 0 && ArrayIn[i] < lesserPositiveNumber) {
                lesserPositiveNumber = ArrayIn[i];
                lesserPositiveNumberIndex = i;
            }
        }
        ArrayIn[lesserPositiveNumberIndex] = largestNegativeNumber;
        ArrayIn[largestNegativeNumberIndex] = lesserPositiveNumber;
        System.out.println();
        for (int k = 0; k < ArrayIn.length; k++) {
            System.out.print(ArrayIn[k] + "  ");
        }
    }

    private int Sum;

    public void doSum(int ArrayIn[]) { //Sum of numbers on even positions
        System.out.println("\nSecond Task:");
        for (int i = 0; i < ArrayIn.length; i++) {
            if ((i + 1) % 2 == 0) {
                Sum = Sum + ArrayIn[i];
            }
        }
        System.out.print(Sum);
    }

    public void doReplace(int ArrayIn[]) {
        System.out.println("\nThird Task:"); //Replaces all negative numbers in array with zeros
        for (int i = 0; i < ArrayIn.length; i++) {
            if (ArrayIn[i] < 0) {
                ArrayIn[i] = 0;
            }
            System.out.print(ArrayIn[i] + "  ");
        }

    }

    public void doTriple(int[] ArrayIn) {
        System.out.println("\nForth Task:"); //Triple the positive numbers in array if there are negative number in the next position
        for (int i = 0; i < ArrayIn.length - 1; i++) {
            if (ArrayIn[i] > 0 && ArrayIn[i + 1] < 0) {
                ArrayIn[i] = ArrayIn[i] * 3;
            }
            System.out.print(ArrayIn[i] + "  ");
        }
    }

    public void doDiff(int[] ArrayIn) {
        System.out.println("\nFifth Task:"); //Difference between array average and lesser number in array
        int Average, Sum = 0;
        int Lesser = ArrayIn[0];
        for (int i = 0; i < ArrayIn.length; i++) {
            if (ArrayIn[i] < Lesser) {
                Lesser = ArrayIn[i];
            }
            Sum = Sum + ArrayIn[i];
        }
        Average = Sum / ArrayIn.length;
        System.out.print(Average + " - " + Lesser + " = " + (Average - Lesser));
    }

    public void doCheck(int[] ArrayIn) { //Returns repeated array elements on uneven positions
        System.out.println("\nSixth Task:");
        int count;
        for (int i = 0; i < ArrayIn.length; i++) {
            count = 0;
            for (int j = 0; j < ArrayIn.length; j++) {
                if (ArrayIn[i] == ArrayIn[j]) {
                    count++;
                }
            }
            if (count > 1 && (i + 1) % 2 != 0) {
                System.out.print("Position: " + (i + 1) + " Value: " + ArrayIn[i] + "  \n");
            }
        }

    }
}