import java.util.Scanner;
public class WayTooLongWords {
    public static void main(String[] args){
        int n;
        String line;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            line=sc.next();
            if(line.length()>10){
                System.out.print(line.charAt(0));
                System.out.print(line.length()-2);
                System.out.print(line.charAt(line.length()-1));
                System.out.println();
            }
            else{
                System.out.println(line);
            }
        }
    }
}
