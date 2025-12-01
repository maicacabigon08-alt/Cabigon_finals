
/**
 * Write a description of class ArrayProblem_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Arrays;


public class ArrayProblem_2{
    public static void mian(String[] args){
        int[] arr = {7, 3, 7, 2, 7, 5, 1, 7, 9, 4,};
        int count = 0;
        
        for (int x : arr){
            if (x == 7) {
                count++;
            }
        }
        
        System.out.println("The number 7 appears " + count +"Times.");
    }
}
