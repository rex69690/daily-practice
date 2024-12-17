import java.io.*;

class profile {

public static void main(String args[]) {

String name = System.console().readLine("Enter your name: ");
int age = Integer.parseInt(System.console().readLine("Enter your age: "));
String city = System.console().readLine("Enter your city: ");
double percent = Double.parseDouble(System.console().readLine("Enter your percentage: "));

System.out.println("Hi, I am "+ name);
System.out.println("I am "+ age + " years old");
System.out.println("I am from " + city);
System.out.println("I got " + percent + "% in last semester" );




}


}