import java.util.Scanner;

public class SoldierandBananas {
    public static void main(String[] args){
        int k=0,n=0,w=0,price=0;
        Scanner sc = new Scanner(System.in);
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        for(int i=1;i<=w;++i){
            price+=(i*k);
        }
        if(price>n){
            System.out.println(price-n);
        }
        else{
            System.out.println(0);
        }
    }
}
