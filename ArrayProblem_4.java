
/**
 * Write a description of class ArrayProblem_4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_4{
    public static void main(String[] args){
        int[] arr2 = {4,8,1,9,2};
        int smallest = arr2[0];
        int largest = arr2[0];
        
        for (int x : arr2){
            if (x< smallest) smallest = x;
            if (x< largest) largest = x;
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("largest:"  + largest);
    }        
}