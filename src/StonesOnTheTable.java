import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=0,toremove=0;
        n=sc.nextInt();
        String line=sc.next();
        for(int i=0;i<n-1;++i){
            if(line.charAt(i)==line.charAt(i+1)){
                ++toremove;
            }
        }
        System.out.println(toremove);
    }
}
