import java.util.Scanner;

public class YoungPhysicist {
    public static void main(String[] args){
        int n,a=0,b=0,c=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            a+=sc.nextInt();
            b+=sc.nextInt();
            c+=sc.nextInt();
        }
        if(a==0 && b==0 && c==0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }


}
