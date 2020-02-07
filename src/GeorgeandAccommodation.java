import java.util.Scanner;

public class GeorgeandAccommodation {
    public static void main(String[] args){
        int n,p,q,ans=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            p=sc.nextInt();
            q=sc.nextInt();
            if(q-p>=2){
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
