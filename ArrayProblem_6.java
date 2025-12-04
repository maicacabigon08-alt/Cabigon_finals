
/**
 * Write a description of class ArrayProblem_6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_6{
public static void main(String[] args){
      int[] arr4 = {1, 2, 3, 4, 5, 7};
        int sumOdd = 0, countOdd = 0;

        for (int x : arr4) {
            if (x % 2 != 0) {
                sumOdd += x;
                countOdd++;
            }
        }
        double avgOdd = (double) sumOdd / countOdd;
        System.out.println("Average of odd numbers: " + avgOdd);
    }
}