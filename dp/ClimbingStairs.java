package dp;

public class ClimbingStairs {

    private static int solve(int n) {
        if (n == 0 || n == 1) return 1;

        return solve(n - 1) + solve(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(solve(50));
    }
}