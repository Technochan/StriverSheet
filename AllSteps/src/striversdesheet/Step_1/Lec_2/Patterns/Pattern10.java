package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n = 5;
        int num;
        for(int i=1 ; i<=n*2-1 ; i++){
            for(int j=1 ; j<=n ; j++){
                num = i <= n ? i : 2*n-i;
                if(j <= num){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
