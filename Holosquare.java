import java.util.Scanner;

class Holosquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // int n = input.nextInt();
        // // int c = input.nextInt();
        // for (int i = 1; i <= n; i++) {
        // for (int j = n - 1; j >= i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k < i; k++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // int n = 6;
        // String s = input.next();
        // System.out.println(s.indexOf("c"));
        // String a = s.substring(3, n);
        // System.out.println(a);
        // String a = input.next();
        // String con = s + a;
        // System.out.println(con);

        int T = input.nextInt();
        while (T-- > 0) {
            int N = input.nextInt();
            int n = N / 2;
            String S = input.next();
            String a = S.substring(0, n);
            String b = S.substring(n, N);
            if (a + b == b + a) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }

        }

    }

}
