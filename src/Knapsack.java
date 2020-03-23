import java.util.Arrays;
import java.util.Scanner;

public class Knapsack {
    static int[][] dp;
    public static void main(String[] args){
        int n,W;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        W=sc.nextInt();
        int[] weight=new int[n];
        int[] cost=new int[n];
        dp=new int[n+1][W+1];
        for(int i=0;i<n+1;++i){
            for(int j=0;j<W+1;++j){
                dp[i][j]=-1;
            }
        }
        for(int i=0;i<n;++i){
            weight[i]=sc.nextInt();
            cost[i]=sc.nextInt();
        }
        System.out.println(knapsack(weight,cost,n-1,W));
    }
    public static int knapsack(int[] weight,int[] cost,int k,int W){
        if(weight.length==0 || cost.length==0 || W==0 || k<0)return  0;
        if(dp[k][W]!=-1){
            return dp[k][W];
        }
        else{
            if(weight[k]<=W){
                dp[k][W]=Math.max(cost[k]+knapsack(weight,cost,k,W-weight[k]),knapsack(weight,cost,k-1,W));
                return dp[k][W];
            }
            else{
                dp[k][W]=knapsack(weight,cost,k-1,W);
                return dp[k][W];
            }
        }
    }
}