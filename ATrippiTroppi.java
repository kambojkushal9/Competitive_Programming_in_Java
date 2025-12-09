import java.util.*;
public class ATrippiTroppi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String a = sc.next();
            String b= sc.next();
            String c = sc.next();
            String an="";
            an+=a.charAt(0);
            an+=b.charAt(0);
            an+=c.charAt(0);
            System.out.println(an);
        }
    }
}
