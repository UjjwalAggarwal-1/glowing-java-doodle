import java.util.*;

//cd "/root/Code/Java/FirstTime/Patterns/" && javac patterns.java && java HollowRectangle
class HollowRectangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0;i<n;i++){
            if(i==0 || i==n-1){
                for (int j=0;j<m;j++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                System.out.print("* ");
                for (int j=0;j<m-2;j++){
                    System.out.print("  ");
                }
                System.out.print("* ");
                System.out.println();
            }
        }
    }
}