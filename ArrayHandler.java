/*
 * ArrayHandler class
 * Contains main functionality for solving few operations with arrays
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 1
 * */

import java.lang.Math; // for Math.random();

public class ArrayHandler {

    public int[] doFillArray(int arraySize){
        int[] targetArray = new int[arraySize];
        for (int j = 0; j < targetArray.length; j++) { // Filling JunkArray with random numbers from [-10;10]
            targetArray[j] = (int)((Math.random()*21)-10);
        }
        return(targetArray);
    }
    private int largestNegativeNumberIndex = -1;
    private int lesserPositiveNumberIndex = -1;
    private int swapBuffer;
    public void doSwap(int[] arrayIn) { // Swaps biggest negative and lesser positive numbers in the input array
        System.out.print("\nFirst Task:");
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] < 0 && largestNegativeNumberIndex == -1 ||
                    arrayIn[i] < 0 && largestNegativeNumberIndex >= 0 && arrayIn[i] > arrayIn[largestNegativeNumberIndex]) {
                largestNegativeNumberIndex = i;
            }
            if (arrayIn[i] > 0 && lesserPositiveNumberIndex == -1 ||
                    arrayIn[i] > 0 && lesserPositiveNumberIndex >= 0 && arrayIn[i] < arrayIn[lesserPositiveNumberIndex]) {
                lesserPositiveNumberIndex = i;
            }
        }
        swapBuffer = arrayIn[lesserPositiveNumberIndex];
        arrayIn[lesserPositiveNumberIndex] = arrayIn[largestNegativeNumberIndex];
        arrayIn[largestNegativeNumberIndex] = swapBuffer;
        System.out.println();
        printArray(arrayIn);
    }

    private int Sum;

    public void doSum(int arrayIn[]) { //Sum of numbers on even positions
        System.out.println("\nSecond Task:");
        for (int i = 0; i < arrayIn.length; i++) {
            if ((i + 1) % 2 == 0) {
                Sum = Sum + arrayIn[i];
            }
        }
        System.out.print(Sum);
    }

    public void doReplace(int arrayIn[]) {
        System.out.println("\nThird Task:"); //Replaces all negative numbers in array with zeros
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] < 0) {
                arrayIn[i] = 0;
            }
        }
        printArray(arrayIn);
    }

    public void doTriple(int[] arrayIn) {
        System.out.println("\nForth Task:"); //Triple the positive numbers in array if there is negative number in the next position
        for (int i = 0; i < arrayIn.length - 1; i++) {
            if (arrayIn[i] > 0 && arrayIn[i + 1] < 0) {
                arrayIn[i] = arrayIn[i] * 3;
            }
        }
        printArray(arrayIn);
    }

    public void doDiff(int[] arrayIn) {
        System.out.println("\nFifth Task:"); //Difference between array average and lesser number in array
        double average;
        int sum = 0;
        int lesser = arrayIn[0];
        for (int i = 0; i < arrayIn.length; i++) {
            if (arrayIn[i] < lesser) {
                lesser = arrayIn[i];
            }
            sum = sum + arrayIn[i];
        }
        average = sum / arrayIn.length;
        System.out.print(average + " - " + lesser + " = " + (average - lesser));
    }

    public void doCheck(int[] arrayIn) { //Returns repeated array elements on uneven positions
        System.out.println("\nSixth Task:");
        int count;
        for (int i = 0; i < arrayIn.length; i++) {
            count = 0;
            for (int j = 0; j < arrayIn.length; j++) {
                if (arrayIn[i] == arrayIn[j]) {
                    count++;
                }
            }
            if (count > 1 && (i % 2 != 0)) {
                System.out.print("Position: " + i + " Value: " + arrayIn[i] + "  \n");
            }
        }
    }
    public void printArray(int[] arrayIn){
        for (int i = 0; i < arrayIn.length; i++) {
            System.out.print(arrayIn[i] + "  ");
        }
    }
}