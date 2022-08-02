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
class HollowRectangleSoln{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                if(i==0 || i==n-1 || j==0 || j==m-1){
                    System.out.print("* ");
                }
            else{
                System.out.print("  ");
                }
            }
        System.out.println();
        }
    }
}

//Goes as far as 181 astriks on my current terminal screen then 182nd is in new line
class InvertedRotatedHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

class NumericalHalfPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

class FloydsTriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter);
                System.out.print(" ");
                counter++;
            }
            System.out.println();
        }
    }
}

class Butterfly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=2*n;i++){
            for(int j=1;j<=2*n;j++)
                if(i<=n && (j<=i || j>=2*n+1-i)){
                    System.out.print("* ");
                }else if(i>n &&(j<=2*n+1-i || j>=i)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                System.out.println();
        }
    }
}

class SolidRhombus{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=2*n-1; j++){
                if(j>=n-i+1 && j<=2*n-i){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

class NumberPyramid{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            for (int j = 1; j < 2*n; j++){
                if (j >= n-i && j <= n+i && (i+j)%2 == 1){
                    System.out.print(i+1);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

class DiamondPattern{
    public static void main(String[] args){
        int n =4;
        for (int i = 1; i <= 2*n; i++){
            for (int j = 1; j <= 2*n; j++){ 
                if ((i<=n && j<=n-i)||(i>n && j<=i-n)){
                    System.out.print("  ");
                } else if ((i<=n && j>=n+1-i && j<=n-1+i)||(i>n && j>=2*i-1-4*n && j<=3*n-i+1)){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}

class DiamondPattern2{
    public static void main(String[] args){
        int n =4;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n-i; j++){ 
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*i-1; j++){ 
                System.out.print("# ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){ 
                System.out.print("  ");
            }
            for (int j = 1; j <= 2*(n-i)+1; j++){ 
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}