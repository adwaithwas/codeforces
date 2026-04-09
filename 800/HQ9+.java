import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        if(s.contains("H") || s.contains("Q") || s.contains("9")) System.out.println("YES");
        else System.out.println("NO");

        scan.close();
    }
}