import java.util.Scanner;

public class WeirdAlgorithm {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        sc.close();
        while(n > 1){
            
            if(n % 2 == 0){
                System.out.print(n + " ");
                n = n/2;
            } else {
                System.out.print(n + " ");
                n = n*3 + 1;
            }
        }
        if(n == 1){
            System.out.print(n + " ");
        }
    }
}
