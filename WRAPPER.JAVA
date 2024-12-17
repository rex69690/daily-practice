class WRAPPER{

public static void main() {

int  a = 20;
Integer b = new Integer(a);    //boxing - wraping it into a new var object
int c = b.intValue();   // unboxing
System.out.println("a = " + a + " b = " + b + "  c = " + c);

}

}