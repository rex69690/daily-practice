import java.util.Scanner;

class PizzaMenu {

public static void main(String args[]) 
{
double pizzaPrice = 0;
double  sizePrice = 0 ; 
double  toppingsPrice = 0 ;
String anotherBuy = "";

Scanner sc = new Scanner(System.in);

do{
String menuBox = ("Pizza Menu : \n" +
                   "1.Margherita - $8 \n" +
		   "2.Pepperoni - $10 \n" +
	           "3.Veggie - $9\n" + 
                    "4.BBQ Chicken - $12\n");


System.out.println("Choose pizza by typing the serial number : \n");

System.out.println(menuBox);
int pizzaType = Integer.parseInt(sc.nextLine());


switch(pizzaType) {

case 1 : 
  System.out.println("You selected Margherita.");
  pizzaPrice = 8;
  break;

case 2 : 
  System.out.println("You selected Pepperoni.");
   pizzaPrice = 10;
  break;

case 3 : 
  System.out.println("You selected Veggie.");
  pizzaPrice = 9;
  break;

case 4 : 
  System.out.println("You selected BBQ Chicken.");
   pizzaPrice = 12;
  break;

default: 

System.out.println("wrong selection....");

}




if (pizzaType >= 1 && pizzaType <= 4)
{
 
System.out.println("Choose Size of pizza : ");

String menuSize = ("1. Small - $2\n" +
		    "2. Medium - $4\n" + "3.Large - $6\n");

System.out.println(menuSize);

   int pizzaSize = Integer.parseInt(sc.nextLine());
   
   switch (pizzaSize){
   
       case 1: 
	  System.out.println("You chose small size.");
          sizePrice = 2;
	  break;
    
       case 2: 
	    System.out.println("You chose medium size.");
	     sizePrice = 4;
	    break;
      
       case 3: 
	    System.out.println("You chose large size.");
             sizePrice = 6;
	     break;
        default: 
	   System.out.println("Wrong size....");
	   break;

    }

System.out.println("Do you want to add toppings?\n"+
		    "1.Cheese - $1 \n" +
		     "2. Olives - $1.5 \n" +
			"3. Mushrooms - $2 \n" +
		      "4. Bacon - $3 \n");
System.out.println("Enter your topping choice ");

int pizzaToppings = Integer.parseInt(sc.nextLine());



switch(pizzaToppings) {

case 1:
 System.out.println("You added Cheese.");
  toppingsPrice = 1;
 break;
    
case 2:
 System.out.println("You added Olives.");
 toppingsPrice = 1.5;
 break;

case 3:
 System.out.println("You added Mushrooms.");
  toppingsPrice = 2;
 break;
    

case 4:
 System.out.println("You added Bacon.");
 toppingsPrice = 3;
 break;
    
default:
 System.out.println("wrong choice....");
 break;

}

double totalPrice = pizzaPrice + sizePrice + toppingsPrice;

System.out.println("Your total amount is : " + "$"+ totalPrice);

System.out.println("Would you like to buy another pizza? .....(Yes/No)");

 anotherBuy = sc.nextLine().toLowerCase();

}


}while(anotherBuy.equals("yes"));

System.out.println("Thank you for your order! ");












}




}