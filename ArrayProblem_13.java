
/**
 * Write a description of class ArrayProblem_13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_13{
    public static void main(String[] args){
        
           int[] grades = {80, 72, 90, 60, 85};
        int passed = 0, failed = 0;

        for (int g : grades) {
            if (g >= 75) passed++;
            else failed++;
        }
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);

    }
    
}


