import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0, arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        k = arr[k-1];
        for(int i: arr) if(i>=k && i>0) count++;

        System.out.println(count);
        
        scan.close();
    }
}