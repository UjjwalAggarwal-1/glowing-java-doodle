// class FirstClass{
//     public static void main(String args[]){
//         System.out.println("Hello World");
//     }
// }

import java.util.*;

// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         System.out.println(a+b);
//     }
// }

class SecondOne{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1:
            System.out.println("1 was selected");
            break;
            case 2:
            System.out.println("2 was selected");
            break;
            case 3:
            System.out.println("3 was selected");
            break;
            default:
            System.out.println("Can't say what was selected");
        }
    }
}