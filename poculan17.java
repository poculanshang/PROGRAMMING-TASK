
/**
 * Write a description of class poculan17 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class poculan17
{
   public static void main(String [] args){
       int [] arr = {10,20,5,25,15};
       int highest = Integer.MIN_VALUE;
       int secondHighest = Integer.MIN_VALUE;
       
       for(int num : arr){
           if(num > highest){
               secondHighest = highest;
               highest = num;
            }else if (num > secondHighest && num != highest){
                secondHighest = num;
            }
        }
       System.out.print("Second highest number: " + secondHighest);
   }
    }
