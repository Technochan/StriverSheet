package striversdesheet.Step_1.Lec_2.Patterns;

public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        int num;
        for(int i=1 ; i <= n ; i++){
            for(int j=1 ; j <= n*2 ; j++){
               num = j <=n ? j : n*2-j+1;
               if(j > i && j < n*2-i+1  ){
                   System.out.print(" ");
               } else {
                   System.out.print(num);
               }
            }
            System.out.println();
        }
    }
}
