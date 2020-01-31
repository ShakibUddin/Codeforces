import java.util.Scanner;

public class Bitplusplus {
    public static void main(String[] args){
        int n,x=0;
        String statement;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            statement=sc.next();
            if(statement.charAt(0)=='+' || statement.charAt(2)=='+'){
                ++x;
            }
            else{
                --x;
            }
        }
        System.out.println(x);
    }
}
