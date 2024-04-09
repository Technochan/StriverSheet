package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern19 {
    public static void main(String[] args) {
        int n = 5;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n*2 ; j++){
                if(j >= n-i && j < n+i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n*2 ; j++){
                if(j > i && j < n*2-i-1){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
