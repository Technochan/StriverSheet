package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern7 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1 ; i<=n ; i++){
            for(int j=1 ; j<=n*2 ; j++){
                if(j > n-i && j < n+i){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
