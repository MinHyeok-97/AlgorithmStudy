package inflearn.dfsbfsbasic;

//피보나치
public class ex_4 {
    static int[] f;
    static int dfs(int n) {
        if (n == 1) return f[n] = 1;
        else if (n== 2) return f[n] = 1;
        else if (f[n] > 0) return f[n];

        return f[n] = dfs(n - 1) + dfs(n - 2);
    }
    public static void main(String[] args) {
        int n = 10;
        f = new int[n + 1];
        System.out.println(dfs(n));
    }
}
