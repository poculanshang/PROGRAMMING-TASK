
/**
 * Write a description of class poculan12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class poculan12
{
  public static void main(String [] args){
      int [] arr = {1,2,7,7,3,7};
      int target = 7, count = 0;
      
      for(int num : arr){
          if (num == target)count++;
      }
  System.out.println(target + "appears atleast 3 times? " + (count >= 3));  
}
}