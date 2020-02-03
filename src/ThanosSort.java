import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ThanosSort {
    public static void main(String[] args){
        int n,x=0,frequency=0,maxFrequency=0;
        boolean sorted=true,reverseSorted=true;
        ArrayList<Integer> num = new ArrayList<Integer>();
        ArrayList<Integer> dp = new ArrayList<Integer>();
        ArrayList<Integer> index = new ArrayList<Integer>();
        Collections.fill(dp,-1);
        dp.add(1);
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            x=sc.nextInt();
            num.add(x);
            if(i>0){
                if(x>=num.get(i-1)){
                    dp.add(1);
                }
                else{
                    dp.add(0);
                }
            }
        }
        for(int i=0;i<n;++i){
           if(dp.get(i)==0){
               sorted=false;
               break;
           }
        }
        if(sorted){
            System.out.println(n);
            return;
        }
        for(int i=1;i<n;++i){
            if(dp.get(i)==1){
                reverseSorted=false;
                break;
            }
        }
        if(reverseSorted){
            System.out.println(1);
            return;
        }
        index.add(0);
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                index.add(i);
            }
        }
        index.add(n);
        for (int i=0;i<index.size()-2;++i){
            List<Integer> firstHalf = dp.subList(index.get(0),index.get(i+1));
            List<Integer> secondHalf = dp.subList(index.get(i+1),index.get(i+2));
            for(int j=0;j<firstHalf.size();++j){

                if(firstHalf.get(j)==1){
                    ++frequency;
                    if(frequency>=maxFrequency && index.contains(frequency)){
                        maxFrequency=frequency;
                    }
                }
                else{
                    frequency=0;
                }
            }
            frequency=0;
            for(int j=0;j<secondHalf.size();++j){
                if(secondHalf.get(j)==1){
                    ++frequency;
                    if(frequency>=maxFrequency && index.contains(frequency)){
                        maxFrequency=frequency;
                    }
                }
                else{
                    frequency=0;
                }
            }
            frequency=0;
        }
        System.out.println(maxFrequency);
    }
}
