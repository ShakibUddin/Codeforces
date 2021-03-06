import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {
    public static void main(String[] args){
        int n,num=0;
        String name;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        sc.nextLine();
        HashMap<String,Integer> hm = new HashMap<String, Integer>();
        for(int i=0;i<n;++i){
            name=sc.next();
            if(!hm.containsKey(name)){
                hm.put(name,num);
                System.out.println("OK");
            }
            else{
                String prefix=name;
                String suffix=String.valueOf(hm.get(name)+1);
                hm.put(prefix+suffix,Integer.valueOf(suffix));
                hm.replace(name,Integer.valueOf(suffix));
                System.out.println(prefix+suffix);
            }
        }
    }
}
