import java.util.ArrayList;
import java.util.Scanner;

public class KefaandFirstSteps {
    public static void main(String[] args){
        int n,x,size=1,maxSize=1;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        ArrayList<Integer> seq = new ArrayList<Integer>();
        for(int i=0;i<n;++i){
            x=sc.nextInt();
            seq.add(x);
        }
        for(int i=0;i<n-1;++i){
            if(seq.get(i)>seq.get(i+1)){
                if(size>=maxSize){
                    maxSize=size;
                }
                size=1;
            }
            else{
                ++size;
            }
        }
        if(size>maxSize){
            maxSize=size;
        }
        System.out.println(maxSize);
    }

}
