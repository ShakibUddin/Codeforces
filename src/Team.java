import java.util.Scanner;

public class Team {
    public static void main(String[] args){
        int n=0,a,b,c,ans=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            StringBuilder combo= new StringBuilder();
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            combo.append(a);
            combo.append(b);
            combo.append(c);
            if(combo.toString().equals("011") || combo.toString().equals("101") || combo.toString().equals("110") || combo.toString().equals("111")){
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
