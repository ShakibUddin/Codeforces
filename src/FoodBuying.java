import java.util.Scanner;

public class FoodBuying {
    public static void main(String[] args){
        long t,n;
        Scanner sc = new Scanner(System.in);
        t=sc.nextLong();
        for(int i=0;i<t;++i){
            n=sc.nextLong();
            if(n<10){
                System.out.println(n);
            }
            else if(n==10){
                System.out.println(11);
            }
            else{
                int spent=0,remainder=0;
                while(true){
                    spent+=(n/10)*10;
                    remainder= (int) ((n%10)+(n/10));
                    if(remainder<10){
                        spent+=remainder;
                        break;
                    }
                    else{
                        n=remainder;
                    }
                }
                System.out.println(spent);
            }
        }
    }
}
