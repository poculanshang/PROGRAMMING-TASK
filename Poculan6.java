
/**
 * Write a description of class Poculan6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poculan6
{
    public static void main(String [] args){
        int [] arr = {1,2,3,4,5};
        int sum = 0, count = 0;
        
        for(int num : arr){
            if (num % 2 != 0);
                sum += num;
                count++;
            }
        
        
        double average = (count > 0)?(double)
        sum / count : 0;
        System.out.println("Average of odd numbers: " + average);
        
    }
}