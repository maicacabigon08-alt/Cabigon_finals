
/**
 * Write a description of class ArrayProblem_20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ArrayProblem_20{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr12 = {10, 22, 35, 40, 18, 60};
        for (int x : arr12) {
            if (x % 2 == 0 && x > 20) {
                System.out.println(x);
            }
        }

        sc.close();
    }
}
    



