import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        int n = scan.nextInt();
        int w = scan.nextInt();
        int sum = k * w * (w+1)/2;
        System.out.println(Math.max(0, sum-n));

        scan.close();
    }
}