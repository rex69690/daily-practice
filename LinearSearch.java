import java.util.Scanner;


class LinearSearch {


public static void main(String args[]) 
{

Scanner sc = new Scanner(System.in);

int arr[] = new int[10];
int i = 0;

System.out.println("Enter elements of array : ");
for( i = 0 ; i < arr.length ; i++) {
   
  arr[i] = sc.nextInt();

  }


System.out.println("Enter the element you want to search in your array : ");

int target = sc.nextInt();

for(int j = 0 ; j < arr.length ; j++) {

if(arr[j] == target) {
 System.out.println("Element exists in the array.");
break;
}

else if (arr[j] != target) {
System.out.println("Element does not exists in the array.");
break;
}

 }

}




}