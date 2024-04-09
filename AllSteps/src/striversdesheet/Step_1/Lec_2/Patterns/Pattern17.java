package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n = 4;
        char c = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n*2 ; j++){
                if(j >= n-i && j <= n+i ) {
                    System.out.print(j < n ? c++ : c--);
                }
                else {
                    System.out.print(" ");
                }
            }
            c = 'A';
            System.out.println();
        }
    }
}
