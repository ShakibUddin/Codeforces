import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Expression {
    public static void main(String[] args){
        int a,b,c;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        ans.add(a+b+c);
        ans.add(a*b*c);
        ans.add(a+b*c);
        ans.add(a*b+c);
        ans.add((a+b)*c);
        ans.add(a*(b+c));
        System.out.println(Collections.max(ans));
    }
}
