import java.util.Scanner;

public class MotaracksBirthday {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t;
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            int avg=0,sum=0,positive=0,n=0,m=0,maxm=0;
            n=sc.nextInt();
            int[] num = new int[n];
            for(int j=0;j<n;++j){
                num[j]=sc.nextInt();
                if(num[j]!=-1){
                    sum+=num[j];
                    ++positive;
                }
            }
            if(positive==0){
                System.out.println(0+" "+40);
            }
            else{
                avg=sum/positive;
                for(int j=0;j<n;++j){
                    if(num[j]==-1){
                        num[j]=avg;
                    }
                }
                for(int j=0;j<n-1;++j){
                    m=Math.abs(num[j]-num[j+1]);
                    if(m>maxm){
                        maxm=m;
                    }
                }
                System.out.println(maxm+" "+avg);
            }
        }
    }
}
