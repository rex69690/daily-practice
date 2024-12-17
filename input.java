import java.util.Scanner;

class input {

public static void main(String args[])
{


Scanner sc = new Scanner(System.in);

System.out.println("Enter your age: ");
int age = Integer.parseInt(sc.nextLine());
System.out.println("Enter your name: ");
String name = sc.nextLine();
System.out.println("Name = " + name + " age = " + age );

}
}