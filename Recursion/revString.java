public class revString {
    public static void reverseString(String s, int length){
        System.out.print(s.charAt(length-1));
        if (length==1){
            System.out.println();
            return;
        }
        reverseString(s,length-1);
    }
    public static void main(String[] args){
        String s= "ponmlkjihgfedcba";
        reverseString(s, s.length());
    }
}
