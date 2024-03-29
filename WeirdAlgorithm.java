import java.util.Scanner;

/**
 * https://cses.fi/problemset/task/1068
 */
public class WeirdAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        StringBuilder sb = new StringBuilder().append(n);
        while (n != 1) {
            n = (n & 1) == 1 ? (n << 1) + n + 1 : (n >> 1);
            sb.append(' ').append(n);
        }
        System.out.println(sb);
    }
}
