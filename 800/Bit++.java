import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), x = 0;
        while(n-->0){
            String s = scan.next();
            if(s.contains("+")) x++;
            else x--;
        }
        System.out.println(x);

        scan.close();
    }
}
