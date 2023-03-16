import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        while (!"exit".equals(str)) {
            if (str.contains("push")) {
                String[] substr = str.split(" ");
                int n = Integer.valueOf(substr[1]);
                queue.add(n);
                System.out.println("ok");
            }
            if ("pop".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("error");
                    str = reader.readLine();
                    continue;
                }
                int p = queue.pop();
                System.out.println(p);
            }
            if ("front".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("error");
                    str = reader.readLine();
                    continue;
                }
                System.out.println(queue.getFirst());
            }
            if ("size".equals(str)) {
                System.out.println(queue.size());
            }
            if ("clear".equals(str)) {
                queue.clear();
                System.out.println("ok");
            }
            str = reader.readLine();
        }
        System.out.println("bye");
    }
}