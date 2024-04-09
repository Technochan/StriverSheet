package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern22 {
    public static void main(String[] args) {
        int n = 4 , num = 0 ;
        for(int i=0 ; i<n*2-1 ; i++){
            for(int j=0 ; j<n*2-1 ; j++){
                num = Math.min( Math.min( i , Math.abs(j - (n*2-2)) ) , Math.min(j , Math.abs(i - (n*2-2))) );
                System.out.print(n - num);
            }
            System.out.println();
        }
    }
}
