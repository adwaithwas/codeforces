import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        char[] arr = new char[s.length()/2 + 1];
        int k = 0;
        for(char c: s.toCharArray()){
            if(c != '+') arr[k++] = c;
        }
        Arrays.sort(arr);
        StringBuilder str = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            if(i>0) str.append('+');
            str.append(arr[i]);
        }
        System.out.println(str);

        scan.close();
    }
}