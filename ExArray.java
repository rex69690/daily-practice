import java.util.Scanner;

class ExArray {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Single-dimensional array
        int num[] = new int[10];

        System.out.println("Enter 10 numbers for the single-dimensional array:");
        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.print("num = ");
        for (int i : num) {
            System.out.print(" " + i + " ");
        }
        System.out.println();

        // Two-dimensional array
        int arr[][] = new int[3][4];

        System.out.println("Enter 12 numbers for the 3x4 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
