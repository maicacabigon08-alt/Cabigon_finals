
/**
 * Write a description of class ArrayProblem_18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_18{
    public static void main(String[] args){
         int[] arr11 = {1, 2, 3, 4, 2};
        boolean hasDuplicate = false;

        for (int i = 0; i < arr11.length; i++) {
            for (int j = i + 1; j < arr11.length; j++) {
                if (arr11[i] == arr11[j]) {
                    hasDuplicate = true;
                }
            }
        }
        System.out.println(hasDuplicate ? "Duplicate found" : "No duplicates");
 
    }
}


