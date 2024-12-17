
import java.lang.*;
import java.io.*;

class wrap{

public static void main(String args[]) {

int  a = 20;
Integer b = a;    //Auto-boxing - wraping it into a new var object  
int c = b;   // Auto-unboxing
System.out.println("a = " + a + " b = " + b + "  c = " + c);
int d = a  + b;
System.out.println("d = " + d);



String s1 = "110";
int p = Integer.parseInt(s1);

String s2 = "2";

double q  = Double.parseDouble(s2);

double sum = p + q;

System.out.println("Sum of a and b is  = "+sum);



}

};