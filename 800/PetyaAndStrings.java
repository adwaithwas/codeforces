import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next().toLowerCase();
        String s2 = scan.next().toLowerCase();
        System.out.println(Integer.signum(s1.compareTo(s2)));

        scan.close();
    }
}