//sliding window
class testing{

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
    }

}