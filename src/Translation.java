import java.util.Scanner;

public class Translation {
    public static void main(String[] args){
        String line,revline;
        Scanner sc= new Scanner(System.in);
        line=sc.next();
        revline=sc.next();
        StringBuilder str = new StringBuilder();
        str.append(line);
        str.reverse();
        if(revline.equals(str.toString())){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
