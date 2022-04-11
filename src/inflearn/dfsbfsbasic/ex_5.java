package inflearn.dfsbfsbasic;

//부분 집합
public class ex_5 {
    static int n;
    static boolean[] check;

    static void dfs(int L) {
        //중단 조건
        if (L == n + 1) {
            String answer = "";

            for (int i = 1; i <= n; i++) {
                if (check[i]) {
                    answer += (i + " ");
                }
            }

            if (answer.length() > 0) System.out.println(answer);
        } else {
            check[L] = true;
            dfs(L + 1);
            check[L] = false;
            dfs(L + 1);
        }
    }

    public static void main(String[] args) {

        n = 3;
        check = new boolean[n + 1];

        dfs(1);

    }
}
