
/**
 * Write a description of class Poculan5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poculan5
{
   public static void main(String [] args){
       int [] arr = {3,5,8,2,9};
       
       for(int num : arr){
           if (num == 8){
               
               System.out.println("Found 8! Stopping.");
               break;
           }
       
   
       System.out.println("Checking:" + num);
    }
}
}