import java.util.Scanner;
import java.util.TreeSet;

public class BoytoGirl {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int distinct=0;
        TreeSet<Character> ts = new TreeSet<Character>();
        String line=sc.next();
        for(int i=0;i<line.length();++i){
            ts.add(line.charAt(i));
        }
        if(ts.size()%2==0){
            System.out.println("CHAT WITH HER!");
        }
        else{
            System.out.println("IGNORE HIM!");
        }
    }
}
