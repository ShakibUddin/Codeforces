import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line=sc.next();
        System.out.print(Character.toUpperCase(line.charAt(0)));
        System.out.print(line.substring(1,line.length()));
    }
}
