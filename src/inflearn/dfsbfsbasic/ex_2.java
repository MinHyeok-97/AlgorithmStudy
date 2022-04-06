package inflearn.dfsbfsbasic;

//이진수 출력
public class ex_2 {
    static void dfs(int n) {
        if (n == 0) {
            return;
        } else {
            dfs(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        dfs(11);
    }
}
