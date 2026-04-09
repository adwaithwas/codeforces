import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), count = 0;
        String s = scan.next();
        for(int i=0; i<n-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) count++;
        }
        System.out.println(count);
        scan.close();
    }
}