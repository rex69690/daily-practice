import java.util.Scanner;
class WhileSum{


public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter your number : ");

int no = sc.nextInt();


int sum = 0;
int digit = 0;


do{

digit = no%10;
sum = sum + digit;
no = no/10;



}while(no>0);


System.out.println(sum);

//Using for each loop.......


int num [] = {1,2,3,4,5};
for(int number : num)
{
System.out.print(number + " ");

}


}
}