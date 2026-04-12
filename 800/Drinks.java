import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), count = 0, sum = 0;
        while(n-->0){
            sum += scan.nextInt();
            count++;
        }
        System.out.println((double)sum/count);

        scan.close();
    }
}