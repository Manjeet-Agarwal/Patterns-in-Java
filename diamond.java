import java.util.*;

public class diamond {
// to print diamond shaped pattern

    public static void diamond_pattern(int n){
               //Upper half
               for (int i =1; i<=n;i++){
                   // spaces - (n-i)
                   for (int j=1; j<=(n-i);j++){
                       System.out.print("  ");
                   }
                   // stars - (2i-1)
                   for (int j =1; j<=2*i-1;j++){
                       System.out.print("* ");
                   }
                  System.out.println();
               }
        
               // bottom half
               for (int i=n;i>=1;i--){
                   for (int j=1; j<=(n-i);j++){
                       System.out.print("  ");
                   }
                   // stars - (2i-1)
                   for (int j =1; j<=2*i-1;j++){
                       System.out.print("* ");
                   }
                   System.out.println();
               }
           }
           public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("What's the diamond size? (Integer value only): ");
            int n = sc.nextInt();
            System.out.println();   
               diamond_pattern(n);
           }
    
}
