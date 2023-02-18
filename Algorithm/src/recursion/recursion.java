package recursion;

public class recursion {
    public static void main(String[] args) {
        int n = 3;
        System.out.println("res=" + fact(n));
    }
    private static int  fact(int n) {
        if (n == 1)
        {
            return 1;
        }
        int prevfact = fact(n - 1);
        return n * prevfact;
    }
}
