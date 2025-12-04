
/**
 * Write a description of class ArrayProblem_7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_7{
    public static void main(String[] args){
        
         int[] arr5 = {-3, 4, -7, 8, -1};
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < 0) {
                arr5[i] = -arr5[i];
            }
        }
        System.out.println("Converted array:");
        for (int x : arr5) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
    
