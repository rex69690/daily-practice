import java.util.Scanner;

class JaggedArray {

public static void main(String args[])
 {

Scanner sc = new Scanner(System.in);

int arr[][] = new int[4][];


arr[0] = new int[3];    // first row will have 3 values
arr[1] = new int[4];    // second row will have 4 values
arr[2] = new int[2];    // third row will have 2 values
arr[3] = new int[1];    // forth row will have only 1 value.

System.out.println("Enter array elemnets :");
for(int i = 0 ; i < arr.length ; i++) {

for(int j = 0 ; j < arr[i].length ; j++) {

arr[i][j] = sc.nextInt();

}


}


for (int i[] : arr) {
   for(int j : i) {
System.out.print(j);
}
System.out.println();

}


}


}