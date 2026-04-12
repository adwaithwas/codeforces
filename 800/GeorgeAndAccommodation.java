import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        while(n-->0){
            int p = scan.nextInt();
            int q = scan.nextInt();
            if(p<q-1) count++;
        }
        System.out.println(count);

        scan.close();
    }
}