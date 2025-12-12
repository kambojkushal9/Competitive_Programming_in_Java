import java.util.*;
public class AFavoriteSequence {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            int a=0;
            int b = n-1;
            while(a<=b){
                if(a==b) System.out.print(arr[a]);
                else System.out.print(arr[a]+" "+arr[b]+" ");
                a++;
                b--;
            }
            System.out.println();
        }
    }
}