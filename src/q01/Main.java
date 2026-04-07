import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

      
        for (int i = 0; i <= n; i++) {
            
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
           
            System.out.print("*");
            
          
            if (i > 0 && i < n) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
            }
            
          
            if (i > 0) {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
        
        for (int i = n - 1; i >= 1; i--) {
           
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            
            
            System.out.print("*");
            
           
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print(" ");
            }
            
            
            System.out.print("*");
            
            System.out.println();
        }
    }
}

        // TODO: Print a hollow diamond pattern of half-height n using '*'
        //
        // Rules:
        //   - Only border cells have '*', inside is spaces
        //   - No trailing spaces on any line
        //
        // Input: 4
        // Output:
        //    *
        //   * *
        //  *   *
        // *     *
        //  *   *
        //   * *
        //    *

    
