
/**
 * Write a description of class ArrayProblem_8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayProblem_8{
    public static void main(String[] args){


    int[] A = {1, 2, 3, 4};
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            B[i] = A[i];
        }
        System.out.println("Array B:");
        for (int x : B) {
            System.out.print(x + " ");
        }
        System.out.println();
}
}