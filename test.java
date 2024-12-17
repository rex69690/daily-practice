import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class test
 {
  public static void main(String args[])throws IOException
  {
   int a,b,c;
          
   InputStreamReader isr = new InputStreamReader(System.in);
   BufferedReader br = new BufferedReader(isr);
   System.out.println("Enter first number");
   String str1 = br.readLine();   
   a=  Integer.parseInt(str1);
       
   System.out.println("Enter second number");
   String str2 = br.readLine();
   b = Integer.parseInt(str2);
   c = a+b;
   System.out.println("Sum = "+c);  
   }
  }
