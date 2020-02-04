import java.util.Scanner;
public class Taxi {
    public static void main(String[] args){
        int n=0,x=0,rem_student=0,taxi=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int[] dp = new int[5];
        for(int i=0;i<n;++i){
            ++dp[sc.nextInt()];
        }
        if(dp[4]>0){
            taxi+=dp[4];
            dp[4]=0;
        }
        if(dp[3]>0 || dp[1]>0){
            taxi+=Math.min(dp[3],dp[1]);
            int min=Math.min(dp[3],dp[1]);
            dp[3]-=min;
            dp[1]-=min;
        }
        if(dp[3]>0){
            taxi+=3*dp[3]/3;
        }
        taxi+=(2*dp[2])/4;
        rem_student=(2*dp[2])%4;
        taxi+=dp[1]/4;
        dp[1]=dp[1]%4;
        if(rem_student==2){
            if(dp[1]>0){
                if(dp[1]==3){
                    taxi+=2;
                }
                else{
                    ++taxi;
                }
            }
            else{
                ++taxi;
            }
        }
        else{
            if(dp[1]>0){
                ++taxi;
            }
        }
        System.out.println(taxi);
    }
}
