public class ArrayHandler {
    private int LargestNegativeNumber = -10, LargestNegativeNumberIndex;
    private int LesserPositiveNumber = 10, LesserPositiveNumberIndex;

    public void DoSwap(int[] ArrayIn) { // Method that swaps biggest negative and lesser positive numbers in the input array
        System.out.print("\nFirst Task: Swap biggest negative and lesser positive numbers:");
        for (int i = 0; i < ArrayIn.length; i++) {
            if (ArrayIn[i] < 0 && ArrayIn[i] > LargestNegativeNumber) {
                LargestNegativeNumber = ArrayIn[i];
                LargestNegativeNumberIndex = i;
            }
            if (ArrayIn[i] > 0 && ArrayIn[i] < LesserPositiveNumber) {
                LesserPositiveNumber = ArrayIn[i];
                LesserPositiveNumberIndex = i;
            }
        }
        ArrayIn[LesserPositiveNumberIndex] = LargestNegativeNumber;
        ArrayIn[LargestNegativeNumberIndex] = LesserPositiveNumber;
        System.out.println();
        for (int k = 0; k < ArrayIn.length; k++) {
            System.out.print(ArrayIn[k] + "  ");
        }
    }

    private int Sum;

    public void DoSum(int ArrayIn[]) {
        System.out.println("\nSecond Task: Sum of numbers on even positions");
        for (int i = 0; i < ArrayIn.length; i++) {
            if ((i + 1) % 2 == 0) {
                Sum = Sum + ArrayIn[i];
            }
        }
        System.out.print(Sum);
    }

    public void DoReplace(int ArrayIn[]) {
        System.out.println("\nThird Task: Replaace all negative numbers in array with zeros");
        for (int i = 0; i < ArrayIn.length; i++) {
            if (ArrayIn[i] < 0) {
                ArrayIn[i] = 0;
            }
            System.out.print(ArrayIn[i] + "  ");
        }

    }

    public void DoTriple(int[] ArrayIn) {
        System.out.println("\nForth Task: Triple the positive numbers in array if there are negative number in the next position");
        for (int i = 0; i < ArrayIn.length - 1; i++) {
            if (ArrayIn[i] > 0 && ArrayIn[i + 1] < 0) {
                ArrayIn[i] = ArrayIn[i] * 3;
            }
            System.out.print(ArrayIn[i] + "  ");
        }
    }

    public void DoDiff(int[] ArrayIn) {
        System.out.println("\nFifth Task: Difference between array average and lesser number in array:");
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

    public void DoCheck(int[] ArrayIn) {
        System.out.println("\nSixth Task: Return repeated array elements on uneven positions:");
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