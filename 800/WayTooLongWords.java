import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        while(n-->0){
            String s = scan.nextLine();
            if(s.length() > 10){
                System.out.println("" + s.charAt(0) + (s.length()-2) + s.charAt(s.length()-1));
            } else System.out.println(s);
        }
        scan.close();
    }
}