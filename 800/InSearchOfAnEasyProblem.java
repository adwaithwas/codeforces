import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        while(n-->0){
            int i = scan.nextInt();
            if(i==1){
                System.out.println("HARD");
                return;
            }
        }
        System.out.println("EASY");

        scan.close();
    }
}