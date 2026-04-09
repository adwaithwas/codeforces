import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a=0, b=0, c=0;
        while(n-->0){
            a += scan.nextInt();
            b += scan.nextInt();
            c += scan.nextInt();
        }
        if(a == 0 && b == 0 && c == 0) System.out.println("YES");
        else System.out.println("NO");

        scan.close();
    }
}