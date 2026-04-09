import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] arr = scan.next().toCharArray();
        int a = 0, d = 0;
        for(char c: arr){
            if(c=='A') a++;
            else d++;
        }
        if(a>d) System.out.println("Anton");
        else if(a==d) System.out.println("Friendship");
        else System.out.println("Danik");

        scan.close();
    }
}