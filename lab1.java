
/**
 * Write a description of class lab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lab1
{
 public static void main(String[] args)
 {
     int counter=0;
     //monte carlo simulation
     for(int j=0;j<1000000;j++)
     {
     int[] result= new int[6];
     //filling the array
     for (int i=0;i<result.length;i++)
     {
         result[i]=draw();
         //check to make sure this number has not already been drawn
         check(result);
         //System.out.println(result[i]);
     }
     //run through array and check pairs
     for(int i=0; i<result.length-1;i++)
     {
         if (result[i++]-result[i]!=1)
         {counter++;}
         
     }
     //System.out.println("number of times there are consecutive pairs:" + counter);
    }
    //System.out.println("counter is: " + counter);
    double count= (double)(counter);
    //The code has to make 5 checks per draw, so therefore there is 5*number of simulations
    double prob= count/5000000;
    //System.out.println("probability of there being no consecutive balls drawn: " + prob);
    double percentage= prob*100;
    System.out.println("Proability percentage= " + percentage + "%");
    
 }
 
 public static int draw()
 { int value=(int)(Math.random()*46);
   return value;
 }
 
 public static void check(int[] ar)
 {
     
     for(int i=0; i<ar.length-1;i++)
     {
         if(ar[i]==ar[i+1] && ar[i]!=0)
         {ar[i]=draw();
          check(ar);
         }
            
    }
 }
}
