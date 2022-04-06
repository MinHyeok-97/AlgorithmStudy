package inflearn.dfsbfsbasic;

//재귀함수 스택프레임
public class ex_1 {
    static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        dfs(3);
    }
}
