import java.util.Scanner;

public class NonZero {
    public static int sum(int[] num){
        int s=0;
        for(int i=0;i<num.length;++i){
            s+=num[i];
        }
        if(s==0){
            return 1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args){
        int t,n,ans=0;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            n=sc.nextInt();
            int[] num =new int[n];
            for(int j=0;j<n;++j){
                num[j]=sc.nextInt();
                if(num[j]==0){
                    ++ans;
                    num[j]=1;
                }
            }
            ans+=sum(num);
            System.out.println(ans);
            ans=0;
        }
    }
}
