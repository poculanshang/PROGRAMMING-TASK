
/**
 * Write a description of class Poculan10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Poculan10
{
    public static void main(String [] args){
        int [] arr = {1,3,5,6,7};
        int index = -1;
        
        for(int i = 0; i < arr.length;i++){
            if (arr[i] % 2 == 0){
                index = 1;
                break;
            }
        }
    System.out.println("First even number index:" + index);
    }
}