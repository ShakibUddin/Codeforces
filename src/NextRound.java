import java.util.Scanner;
import java.util.TreeSet;

public class NextRound {
    public static void main(String[] args){
        int n=0,k=0,ans=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;++i){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;++i){
            if(a[i]>=a[k-1] && a[i]>0){
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
