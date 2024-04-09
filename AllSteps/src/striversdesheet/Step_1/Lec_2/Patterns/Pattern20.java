package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int num;
        for(int i=1 ; i<=n*2-1 ; i++){
            for(int j=1 ; j<=n*2-1 ; j++){
                num = i <= n ? i : 2*n-i;
                if(j <= num || j >= n*2-num ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
