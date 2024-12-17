import java.util.Scanner;

class Array{


public static void main(String args[]) 
{

Scanner sc = new Scanner(System.in);
int arr[] = new int[10];



System.out.println("Enter the array elements :");

for(int i =  0 ; i < arr.length ; i++) {
   
  arr[i]= sc.nextInt();


  }

int max = arr[0];
int min = arr[0];
int secondMax= arr[0];

for(int i : arr) {
  if (i > max) {
                secondMax = max;
                max = i;
            } else if (i > secondMax && i != max) {
                secondMax = i;
            }if(i< min) {
 min = i;
}
  }

System.out.println("Max = " + max + " Min = " + min + " Second largest  =" + secondMax);

}



}