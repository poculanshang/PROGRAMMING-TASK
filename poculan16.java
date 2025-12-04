
/**
 * Write a description of class poculan16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class poculan16
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int digits = 0;
        int temp = num;
        
        while(temp != 0){
          temp /= 10;
          digits++;
        }
    System.out.print("Number of digits: " + digits);
    }
}