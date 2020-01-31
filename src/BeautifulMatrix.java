import java.util.Scanner;

public class BeautifulMatrix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int one_i=0,one_j=0,center_i=2,center_j=2;
        for (int i=0;i<5;++i){
            for(int j=0;j<5;++j){
                matrix[i][j]=sc.nextInt();
                if(matrix[i][j]==1){
                    one_i=i;
                    one_j=j;
                }
            }
        }
        System.out.println(Math.abs(one_i-center_i)+Math.abs(one_j-center_j));
    }
}
