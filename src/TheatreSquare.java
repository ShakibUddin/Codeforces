import java.util.Scanner;
public class TheatreSquare {
    public static void main(String[] args){
        long n,m,a,p1=0L,p2=0L;
        Scanner sc = new Scanner(System.in);
        n=sc.nextLong();
        m=sc.nextLong();
        a=sc.nextLong();
        if(n%a==0){
            p1+=n/a;
        }
        else if(n%a==n){
            p1+=1;
        }
        else{
            p1+=(n/a)+1;
        }
        if(m%a==0){
            p2+=m/a;
        }
        else if(m%a==m){
            p2+=1;
        }
        else{
            p2+=(m/a)+1;
        }
        System.out.println(p1*p2);
    }
}
