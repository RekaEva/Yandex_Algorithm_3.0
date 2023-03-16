import java.io.IOException;
import java.util.Scanner;

public class task22 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int arr[] = new int[31];
        arr[1] = 1;
        arr[2] = 1;
        int i;
        for(i = 3; i <= k; i++)
            arr[i] = 2 * arr[i-1];

        for(int j = i;  j <= n; j++)
            arr[j] = 2 * arr[j-1] - arr[j-k-1];
        System.out.println(arr[n]);
        in.close();
    }
}