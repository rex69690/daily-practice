import java.util.Scanner;
class Conditions {

public static void main(String agrs[])

{

Scanner sc = new Scanner(System.in);
System.out.println("Enter percentage :");
float per = Float.parseFloat(sc.nextLine());


if(per > 90) 
{

System.out.println("A+");

}

else if(per > 80 
&& per < 90) 
{

System.out.println("A");

}

else if(per > 70 
&& per < 80) 
{

System.out.println("B+");

}
else if(per > 60 
&& per < 70) 
{

System.out.println("B");

}
else {
System.out.println("Fail");
}

}


}