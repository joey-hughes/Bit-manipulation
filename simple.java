import java.util.Scanner;
/**
 * Write a description of class simple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class simple
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number:" );
        int num= sc.nextInt();
       
        for(int i=0; i<num; i++)
        {
            if(2<<i >= num)
            {
                System.out.println(2<<i);
                break;
            }
        }
    }
}
