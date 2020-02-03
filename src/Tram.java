import java.util.Scanner;

public class Tram {
    public static void main(String[] args){
        int n,exit=0,enter=0,total=0,max=0;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;++i){
            exit=sc.nextInt();
            enter=sc.nextInt();
            total-=exit;
            total+=enter;
            if(total>max){
                max=total;
            }
        }
        System.out.println(max);
    }
}
