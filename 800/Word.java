import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int l=0, u=0;
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c)==true) u++;
            else l++;
        }
        if(u>l) System.out.println(s.toUpperCase());
        else System.out.println(s.toLowerCase());

        scan.close();
    }
}