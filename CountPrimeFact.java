import java.util.*;

public class CountPrimeFact {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 1) {
            System.exit(0);
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {    
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n /= i;
                }
                System.out.println();
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
        sc.close();
    }
}


// public class CountPrimeFact {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for (int i = 2; i < n; i++) {
//             if ((n % i == 0) && isPrime(i)) {
//                 int x = i;
//                 while (n % x == 0) {
//                     System.out.print(i + " ");
//                     x = x * i;
//                 }
//                 System.out.println();
//             }
//         }
//         sc.close();
//     }
//     public static boolean isPrime(int n) {
//         if (n < 2) {
//             return false;
//         }
//         for (int i = 2; i <= Math.sqrt(n); i++) {
//             if (n % i == 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }