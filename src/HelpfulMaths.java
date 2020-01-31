import java.util.*;

public class HelpfulMaths {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line="";
        line=sc.next();
        ArrayList<Integer> ts = new ArrayList<Integer>();
        for(int i=0;i<line.length();++i){
            if(Character.isDigit(line.charAt(i))){
                ts.add(line.charAt(i)-'0');
            }
        }
        Collections.sort(ts);
        for(int i=0;i<ts.size();++i){
            System.out.print(ts.get(i));
            if(i!=ts.size()-1){
                System.out.print("+");
            }
        }

    }
}
