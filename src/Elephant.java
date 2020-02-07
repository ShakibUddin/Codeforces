import java.util.Scanner;

public class Elephant {
    public static void main(String[] args){
        int n,ans=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=5;i>0;--i){
            if(n%i!=n){
                ans+=n/i;
                n%=i;
            }
        }
        System.out.println(ans);
    }
}
