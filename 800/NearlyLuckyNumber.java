import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        for(char c: s.toCharArray()) if(c=='4'||c=='7') count++;
        String c = Integer.toString(count);
        boolean hello = true;
        for(char i: c.toCharArray()){
            if(i!='4'&&i!='7') hello = false;
        }
        if(hello==true) System.out.println("YES");
        else System.out.println("NO");

        scan.close();
    }
}