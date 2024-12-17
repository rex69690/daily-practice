//sliding window
class StringMethods{

    public static void main(String args[]) {

        String s1 = new String();
        System.out.println(s1);   //empty string

        char arr[] = {'A','B','C','D','E'};
        String s3 = new String(arr);
        System.out.println(s3);

        String s4  = new String(arr , 1 , 3);
        System.out.println(s4);

        byte b[] = {65,66,67,68,69,70};
        String s5  = new String(b);
        System.out.println(s5);

        String s6  = new String(b , 2, 4);
        System.out.println(s6);

        String name = "Tushar";
        String name2 = "Upasvi";
        System.out.println(name.startsWith("T"));
        System.out.println(name.equals(name2));
        System.out.println(name.endsWith("r"));
        System.out.println(name.endsWith("Tushar"));
        System.out.println(name2.contains("i"));

        String a1 = "ABCDEF";
        String a2 = "ABCDEF";
        String a3 = "ABCJHF";
        System.out.println(a1.compareTo(a2));
        System.out.println(a1.compareTo(a3));  // -6 because we comparing  a1 to s3 and a1 has smaller values in comparision
        System.out.println(a3.compareTo(a1));  // 6 because we comapring a3 to a1 and it have big values than a1
    }

}