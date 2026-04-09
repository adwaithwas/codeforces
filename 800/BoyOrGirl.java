import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        Set<Character> set = new HashSet<>();
        for(char c: s.toCharArray()) set.add(c);
        if(set.size()%2 == 0) System.out.println("CHAT WITH HER!");
        else System.out.println("IGNORE HIM!");

        scan.close();
    }
}