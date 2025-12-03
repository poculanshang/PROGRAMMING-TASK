
/**
 * Write a description of class Poculan1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Poculan1
{
   public static void main(String [] args){
       
       Scanner in = new Scanner(System.in);
       int [] number = new int [1];
       int num;
       
       do{
           System.out.print("Enter a number between(1-100)");
           num = in.nextInt();
           
        }while(num <1 || num >100);
        number [0] = num;
        
        System.out.println("You entered:"+num);
       }
   }
    
