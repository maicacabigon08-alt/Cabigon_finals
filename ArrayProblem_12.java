
/**
 * Write a description of class ArrayProblem_12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_12{
    public static void main(String[] args){
        
         int[] arr8 = {2, 5, 2, 2, 7, 2};
        int target = 2, count = 0;

        for (int x : arr8) {
            if (x == target) count++;
        }

        if (count >= 3)
            System.out.println("Appears at least 3 times");
        else
            System.out.println("Less than 3 times");

    }
    
}


