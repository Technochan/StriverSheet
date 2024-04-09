package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0 ; i < n ; i++){
            char c = 'A';
            for(int j=0 ; j < n-i ; j++){
                System.out.print(c+++" ");
            }
            System.out.println();
        }
    }
}
