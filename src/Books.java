import java.util.Arrays;
import java.util.Scanner;

public class Books {
    public static void main(String[] args){
        int n,m,reqtime=0,maxread=0,counted=0,read=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        int[] time = new int[n];
        for(int i=0;i<n;++i){
            time[i]=sc.nextInt();
        }
        for(int i=0;i<n;++i){
            reqtime+=time[i];
            if(reqtime>m){
                reqtime-=time[i];
                reqtime-=time[i-counted];
                --counted;
                --i;
                if(read>maxread){
                    maxread=read;
                }
                --read;
            }
            else{
                ++counted;
                ++read;
            }
        }
        if(read>maxread){
            maxread=read;
        }
        System.out.println(maxread);
    }
}
