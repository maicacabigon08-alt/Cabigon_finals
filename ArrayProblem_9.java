
/**
 * Write a description of class ArrayProblem_9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class ArrayProblem_9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
    int total = 0;
        int input;
        do {
            System.out.print("Enter a number (0 to stop): ");
            input = sc.nextInt();
            total += input;
        } while (input != 0);
        System.out.println("Sum: " + total);
}
}