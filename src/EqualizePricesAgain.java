import java.util.Scanner;

public class EqualizePricesAgain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q;
        q=sc.nextInt();
        for(int i=0;i<q;++i){
            double sum=0;
            int n = sc.nextInt();
            int[] price = new int[n];
            for(int j=0;j<n;++j){
                sum+=price[j]=sc.nextInt();
            }
            System.out.println((int)Math.ceil(sum/n));
        }
    }
}
