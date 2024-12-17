public class HelloWorld

{ //'Hello world'  is an identifier for the class

    public static void main(String args[])
    {

	int totalscore = 100; //'totalScore' is an identifier
	final int max_score = 200; //'MAX_SCORE' is an indentifier

	System.out.println("Total Score: " + totalscore);
	
	char ch1 , ch2 , ch3 , ch4;

	ch1 ='A';
	ch2 = 'B';
	ch3 = 65;

	System.out.println("Values of ch1 , ch2 , ch3 are : "+ch1+" "+ch2+ " " +ch3);
	ch1++;
	ch4 = ch1;
	int  a = ch1+ch2;
	System.out.println("Values of ch4 and a are : " +ch4+ " " + a);

	

     }


}