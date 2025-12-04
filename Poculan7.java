
/**
 * Write a description of class Poculan7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poculan7
{
    public static void main(String [] args){
        int [] arr = {-1,2,-3,4,-5};
        
        for (int i = 0; i < arr.length; i++){
            if(arr [i] < 0){
                arr [i] = -arr[i];
                
            }
        }
    System.out.println("Array with positives: ");
    for (int num : arr)System.out.print(num + " ");
    }
}