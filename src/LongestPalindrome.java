import java.util.HashMap;
import java.util.Scanner;

public class LongestPalindrome {
    public static boolean isPalindrome(String line){
        int mid=line.length()/2;
        if(line.length()%2==0){
            StringBuilder lastHalf =new StringBuilder();
            lastHalf.append(line.substring(mid,line.length()));
            lastHalf.reverse();
            if(line.substring(0,mid).equals(lastHalf.toString())){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            StringBuilder lastHalf =new StringBuilder();
            lastHalf.append(line.substring(mid+1,line.length()));
            lastHalf.reverse();
            if(line.substring(0,mid).equals(lastHalf.toString())){
                return true;
            }
            else{
                return false;
            }
        }
    }
    public static void main(String[] args){
        int n,m,ans=0;
        StringBuilder result = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        HashMap<Integer,String > words=new HashMap<Integer, String>();
        for(int i=0;i<n;++i){
           String word=sc.next();
           words.put(i,word);
        }
        for(int i=0;i<n;++i){
            if(isPalindrome(words.get(i))){
                ans+=m;
                words.remove(words.get(i));
            }
            StringBuilder rev = new StringBuilder();
            rev.append(words.get(i));
            rev.reverse();
            if(words.containsValue(rev.toString())){
                ans+=(m*2);
                words.remove(words.get(i));
                words.remove(rev);
            }
        }
        System.out.println(ans);
    }
}
