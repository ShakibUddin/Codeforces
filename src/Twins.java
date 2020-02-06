import java.util.*;

public class Twins {
    public static void main(String[] args){
        int n=0,x=0,ans=1,total=0,i=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> coins = new ArrayList<Integer>();
        TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
        for(i=0;i<n;++i){
            x=sc.nextInt();
            coins.add(x);
        }
        Collections.sort(coins);
        for(i=0;i<n;++i){
            total+=coins.get(i);
            tm.put(i,total);
        }
        total=coins.get(n-1);
        for(i=n-2;i>=0;--i){
            if(total>tm.get(i)){
                System.out.println(ans);
                return;
            }
            else{
                total+=coins.get(i);
                ++ans;
            }
        }
        System.out.println(ans);
    }
}
