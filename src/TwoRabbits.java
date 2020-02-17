import java.math.BigInteger;
import java.util.Scanner;

public class TwoRabbits {
    public static void main(String[] args){
        int x,y,a,b,t=0;
        Scanner sc = new Scanner(System.in);
        t=sc.nextInt();
        for(int i=0;i<t;++i){
            x=sc.nextInt();
            y=sc.nextInt();
            a=sc.nextInt();
            b=sc.nextInt();
            BigInteger p = new BigInteger("0");
            BigInteger q = new BigInteger("0");
            BigInteger r = new BigInteger("0");
            BigInteger time = new BigInteger("0");
            p=BigInteger.valueOf(a).multiply(BigInteger.valueOf(y-x));
            q=BigInteger.valueOf(a+b);
            r=BigInteger.valueOf(a);
            time = (p.divide(q)).divide(r);
            if(p.mod(q).equals(BigInteger.ZERO) && (p.divide(q).mod(r).equals(BigInteger.ZERO))){
                System.out.println(time);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}
