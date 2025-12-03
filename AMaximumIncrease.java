import java.util.*;
public class AMaximumIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int max=1;
        int prev=1;
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                prev++;
                if(max<prev) max=prev;
            }
            else{
                prev=1;
            }
        }
        System.out.println(max);
    }
}
