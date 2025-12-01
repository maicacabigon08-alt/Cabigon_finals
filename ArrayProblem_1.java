
/**
 * Write a description of class ArrayProblem_1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Arrays;
public class ArrayProblem_1
{
   public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
       int num;
       do{
           System.out.print("Enter a number (1-100):");
           num=sc.nextInt();
        }while (num<1 || num> 100);
        System.out.println("Valid numbee:"+ num);
       }
   }
