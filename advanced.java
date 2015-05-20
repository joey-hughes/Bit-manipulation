
import java.util.Scanner;
public class advanced
{
  public static void main(String[] args)
  {
      Scanner sc= new Scanner(System.in);
      System.out.println("please give a number: ");
      int num= sc.nextInt();
      System.out.println(power(0,num));
  }
  
  public static int power(int start,int num)
  {
      //shifting left is the same as multiplying by a power of two
      if(num==0)
      {
          return 1;
      }
      
      if(num==1)
        {return 1;
        }
        
      if(2<<start >= num)
      {
          return 2<<start;
      }
      else
        {
         
          return(power( add(start,1), num));
        }
     
  }
  
  
  public static int add(int a,int b)
  {
      if(b==0) {
          return a;
        } else {
            int sum = a^b;
            int carry = (a&b)<<1;
            return add(sum,carry);
 }
}
}
