
/**
 * Write a description of class ArrayProblem_16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ArrayProblem_16{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
          int[] nums = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            nums[i] = sc.nextInt();
        }
        System.out.println("Numbers greater than 50:");
        for (int x : nums) {
            if (x > 50) System.out.println(x);
        }
    }
}


