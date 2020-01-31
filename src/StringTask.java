import java.util.Scanner;

public class StringTask {
    public static void main(String[] args){
        String line;
        StringBuilder ans= new StringBuilder();
        Scanner sc = new Scanner(System.in);
        line=sc.next();
        line=line.toLowerCase();
        for(int i=0;i<line.length();++i){
            if(line.charAt(i)!='a' && line.charAt(i)!='e' && line.charAt(i)!='i' && line.charAt(i)!='o' && line.charAt(i)!='u' && line.charAt(i)!='y'){
                ans.append('.');
                ans.append(Character.toLowerCase(line.charAt(i)));
            }
        }
        System.out.println(ans.toString());
    }
}
