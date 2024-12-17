import java.util.Scanner;

class BinaryToDecimal {

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter your binary number : ");
String binaryNumber = sc.nextLine();
int decimalNumber = Integer.parseInt(binaryNumber , 2);

System.out.println("Your binary number " + binaryNumber + "  in decimal is " + decimalNumber);

     int DecimalNumber = sc.nextInt(); // Decimal input
        String BinaryNumber = "";

        while (DecimalNumber > 0) {
            int remainder = DecimalNumber % 2;
            BinaryNumber = remainder + BinaryNumber; 
            DecimalNumber = DecimalNumber / 2;
        }
}







}


//take input to binary number adn convert it to decimal