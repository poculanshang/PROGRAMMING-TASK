
/**
 * Write a description of class Poculan4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poculan4
{
public static void main(String [] args){
    int [] arr = {5,2,9,1,7};
    int min = arr[0];
    int max = arr [0];
    
    for(int i = 1; i < arr.length;i++){
        if(arr [i] < min) min = arr [i];
        if(arr [i] > max)max = arr [i];
    }
    
    System.out.println("Smallest:" + min);
    System.out.println("Largest:" + max);
    
}
    }
