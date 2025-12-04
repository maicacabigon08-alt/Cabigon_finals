
/**
 * Write a description of class ArrayProblem_10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_10{
    public static void main(String[] args){


     int[] arr6 = {3, 7, 5, 8, 9};
        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] % 2 == 0) {
                System.out.println("First even number index: " + i);
                break;
            }
        }
}
}