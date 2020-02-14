import java.util.Scanner;

public class LoveLetterMystery {
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
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            int cost=0;
            String line=sc.next();
            if(!isPalindrome(line)){
                for(int j=0,k=line.length()-1;j<line.length()/2;++j,--k){
                    int first = line.charAt(j);
                    int second = line.charAt(k);
                    cost+=Math.abs((second-64)-(first-64));
                }
            }
            System.out.println(cost);
        }
    }
}
