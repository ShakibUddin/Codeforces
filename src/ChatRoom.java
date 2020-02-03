import java.util.Scanner;

public class ChatRoom {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.next();
        String hello="hello";
        int j=0;
        for(int i=0;i<line.length() && j<hello.length();++i){
            if(hello.charAt(j)==line.charAt(i)){
                ++j;
            }
        }
        if(j==hello.length()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
