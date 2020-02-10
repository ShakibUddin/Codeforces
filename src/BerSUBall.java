import java.util.Arrays;
import java.util.Scanner;

public class BerSUBall {
    public static void main(String[] args){
        int b,g,ans=0;
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();
        int[] bs = new int[b];
        for(int i=0;i<b;++i){
            bs[i]=sc.nextInt();
        }
        g=sc.nextInt();
        int[] gs = new int[g];
        for(int i=0;i<g;++i){
            gs[i]=sc.nextInt();
        }
        Arrays.sort(bs);
        Arrays.sort(gs);
        for(int i=0;i<b;++i){
            for(int j=0;j<g;++j){
                if(bs[i]!=0 && gs[j]!=0 && Math.abs(bs[i]-gs[j])<2){
                    bs[i]=0;
                    gs[j]=0;
                    ++ans;
                }
            }
        }
        System.out.println(ans);
    }
}
