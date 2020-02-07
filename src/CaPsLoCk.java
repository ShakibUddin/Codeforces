import java.util.Collections;
import java.util.Scanner;

public class CaPsLoCk {
    public static void main(String[] args){
        String line;
        int upper=0;
        boolean firstLower=false;
        Scanner sc = new Scanner(System.in);
        line=sc.next();
        for(int i=0;i<line.length();++i){
            if(Character.isUpperCase(line.charAt(i))){
                ++upper;
            }
            else{
                if(i==0){
                    firstLower=true;
                }
            }
        }
        if((upper==line.length()) || (upper==line.length()-1 && firstLower)){
            StringBuilder ans = new StringBuilder();
            for(int i=0;i<line.length();++i){
                if(Character.isUpperCase(line.charAt(i))){
                    ans.append(Character.toLowerCase(line.charAt(i)));
                }
                else{
                    ans.append(Character.toUpperCase(line.charAt(i)));
                }
            }
            System.out.println(ans.toString());
        }
        else{
            System.out.println(line);
        }
    }

}
