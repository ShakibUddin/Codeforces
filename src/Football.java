import java.util.Scanner;

public class Football {
    public static void main(String[] args){
        String line;
        int frequency=1;
        Scanner sc = new Scanner(System.in);
        line=sc.next();
        for(int i=0;i<line.length()-1;++i){
            if(line.charAt(i)==line.charAt(i+1)){
                ++frequency;
            }
            else{
                frequency=1;
            }
            if(frequency>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}
