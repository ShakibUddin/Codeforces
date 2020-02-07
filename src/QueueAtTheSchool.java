import java.util.ArrayList;
import java.util.Scanner;

public class QueueAtTheSchool {
    public static void main(String[] args){
        int t,total;
        String line;
        Scanner sc = new Scanner(System.in);
        total=sc.nextInt();
        t=sc.nextInt();
        sc.nextLine();
        ArrayList<Character> order = new ArrayList<Character>();
        line=sc.next();
        for(int i=0;i<total;++i){
            order.add(line.charAt(i));
        }
        for(int i=1;i<=t;++i){
            for(int j=0;j<order.size()-1;++j){
                if(order.get(j)=='B' && order.get(j+1)=='G'){
                    order.set(j+1,'B');
                    order.set(j,'G');
                    ++j;
                }
            }
        }
        for(int i=0;i<order.size();++i){
            System.out.print(order.get(i));
        }
    }
}
