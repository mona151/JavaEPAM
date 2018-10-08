/*
 * Main class
 * EPAM Java training for automation QA
 * Author: Kirill Kuzin
 * Lesson 1 Task 1
 * */


public class Main {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler();
        int[] junkArray = arrayHandler.doFillArray(20);
        System.out.println("Target array filled with random numbers:");
        for (int j = 0; j < junkArray.length; j++) { // Filling JunkArray with random numbers from [-10;10]
            System.out.print(junkArray[j]+"  ");
        }


        arrayHandler.doSwap(junkArray.clone());
        arrayHandler.doSum(junkArray.clone());
        arrayHandler.doReplace(junkArray.clone());
        arrayHandler.doTriple(junkArray.clone());
        arrayHandler.doDiff(junkArray.clone());
        arrayHandler.doCheck(junkArray.clone());
    }
}