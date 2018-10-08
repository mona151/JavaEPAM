import java.lang.Math; // for Math.random();


public class Main {
    public static void main(String[] args) {
        int[] JunkArray = new int[20];
        System.out.println("Target array filled with random numbers:");
        for (int j = 0; j < JunkArray.length; j++) { // Filling JunkArray with random numbers from [-10;10]
            JunkArray[j] = (int)((Math.random()*21)-10);
            System.out.print(JunkArray[j]+"  ");
        }

        ArrayHandler arrayHandler = new ArrayHandler();
        arrayHandler.DoSwap(JunkArray.clone());
        arrayHandler.DoSum(JunkArray.clone());
        arrayHandler.DoReplace(JunkArray.clone());
        arrayHandler.DoTriple(JunkArray.clone());
        arrayHandler.DoDiff(JunkArray.clone());
        arrayHandler.DoCheck(JunkArray.clone());
    }
}
