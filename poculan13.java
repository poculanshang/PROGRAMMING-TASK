
/**
 * Write a description of class poculan13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class poculan13
{
    public static void main(String [] args){
        int [] grades = {80,70,90,60,75};
        int pass = 0,fail = 0;
        
        for(int grade : grades){
            if(grade >= 75)pass++;
            else fail++;
        }
    System.out.print("Passed: " + pass +", Failed: " + fail);
}
}