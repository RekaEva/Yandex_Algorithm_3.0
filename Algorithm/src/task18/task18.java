package task18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class task18 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        while (!"exit".equals(str)) {
            if (str.contains("push_front")) {
                String[] substr = str.split(" ");
                int n = Integer.valueOf(substr[1]);
                queue.addFirst(n);
                System.out.println("ok");
            }
            if (str.contains("push_back")) {
                String[] substr = str.split(" ");
                int n = Integer.valueOf(substr[1]);
                queue.addLast(n);
                System.out.println("ok");
            }
            if ("pop_front".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("error");
                    str = reader.readLine();
                    continue;
                }
                int p = queue.removeFirst();
                System.out.println(p);
            }
            if ("pop_back".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("error");
                    str = reader.readLine();
                    continue;
                }
                int p = queue.removeLast();
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
            if ("back".equals(str)) {
                if (queue.isEmpty()) {
                    System.out.println("error");
                    str = reader.readLine();
                    continue;
                }
                System.out.println(queue.getLast());
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
