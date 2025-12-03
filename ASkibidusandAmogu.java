import java.util.*;
public class ASkibidusandAmogu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            String s = sc.next();
            String a = "";
            if(s.length()==2) a+='i';
            else{
                for(int i=0;i<s.length()-1;i++){
                    if(i!=s.length()-2){
                        a+=s.charAt(i);
                    }
                    else{
                        a+='i';
                    }
                }
            }
            System.out.println(a);
        }
    }
}
