public class myTowerOfHanoi {
    public static void FuntowerOfHanoi(int n, String S, String H, String D){
        if (n==1) {
            System.out.println("transfer disk "+n+" from "+S+" to "+D);
            return;
        }
        FuntowerOfHanoi(n-1, S, D, H);
        System.out.println("transfer disk "+n+" from "+S+" to "+D);
        FuntowerOfHanoi(n-1, H, S, D);
    }

    public static void main(String[] args){
        int n=4;
        FuntowerOfHanoi(n,"S","H","D");
    }
}