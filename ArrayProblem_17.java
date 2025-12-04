
/**
 * Write a description of class ArrayProblem_17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_17{
    public static void main (String[] args){
        
         int[] arr10 = {10, 5, 8, 20, 15};
        int highest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int x : arr10) {
            if (x > highest) {
                second = highest;
                highest = x;
            } else if (x > second && x != highest) {
                second = x;
            }
        }
        System.out.println("Second highest: " + second);
    }
}


