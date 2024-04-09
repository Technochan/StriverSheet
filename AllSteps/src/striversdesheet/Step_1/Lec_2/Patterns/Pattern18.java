package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern18 {
    public static void main(String[] args) {
        int n = 5;
        char c = 'A';
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n; j++){
                if(j >= n-i-1 ){
                    System.out.print(c+++" ");
                } else {
                    c++;
                }
            }
            c = 'A';
            System.out.println();
        }
    }
}
