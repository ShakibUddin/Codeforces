import java.util.Scanner;

public class PetyaandStrings {
    public static void main(String[] args){
        String line1,line2;
        Scanner sc = new Scanner(System.in);
        line1=sc.next();
        line2=sc.next();
        line1=line1.toLowerCase();
        line2=line2.toLowerCase();
        if(line1.compareTo(line2)==0){
            System.out.println(0);
        }
        else if(line1.compareTo(line2)<0){
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
    }
}
