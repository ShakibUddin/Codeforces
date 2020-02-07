import java.util.Scanner;

public class BearandBigBrother {
    public static void main(String[] args){
        int a,b,year=0;
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        while(true){
            a*=3;
            b*=2;
            ++year;
            if(a>b){
                break;
            }
        }
        System.out.println(year);
    }
}
