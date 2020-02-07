import java.util.Scanner;

public class HQ9Plus {
    public static void main(String[] args){
        String line;
        Scanner sc = new Scanner(System.in);
        line=sc.next();
        for(int i=0;i<line.length();++i){
            if(line.charAt(i)=='H' || line.charAt(i)=='Q' || line.charAt(i)=='9'){
                System.out.println("YES");
                return;
            }
            else if(line.charAt(i)=='+'){
                if(line.contains("H") || line.contains("Q") || line.contains("9")){
                    System.out.println("YES");
                    return;
                }
            }
        }
        System.out.println("NO");
    }
}
