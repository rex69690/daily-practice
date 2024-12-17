import java.util.Scanner;

 class PlotSum{

public static void main(String args[]) 
{
Scanner sc = new Scanner(System.in);

int plotArr[] = new int[10];
int sum = 0;

for(int i = 0 ; i < plotArr.length ; i++) 
{

plotArr[i] = sc.nextInt();
sum = sum + plotArr[i];

};


System.out.println("Sum of all the elements of array is : " + sum);


}



}