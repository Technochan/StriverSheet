package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1 ; i <= n ; i++){
            char c = 'A';
            for(int j=1 ; j <= i ; j++){
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
}
