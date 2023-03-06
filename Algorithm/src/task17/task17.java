package task17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class task17 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_first = reader.readLine();
        String s_second = reader.readLine();
        ArrayDeque<Integer> first = new ArrayDeque<Integer>();
        ArrayDeque<Integer> second = new ArrayDeque<Integer>();
        int i = 0;
        while ( i < 5) {
            String[] substr_f = s_first.split(" ");
            int f = Integer.valueOf(substr_f[i]);
            first.add(f);
            String[] substr_s = s_second.split(" ");
            int s = Integer.valueOf(substr_s[i]);
            second.add(s);
            i++;
        }
<<<<<<< HEAD
=======
<<<<<<< HEAD
        int counter = 0;
        int flag = 0;
        while (first.size() != 10 && second.size() != 10)
        {
            if ((first.getFirst() == 9 && second.getFirst() == 0)){
                second.addLast(first.removeFirst());
                int tmp = second.removeFirst();
                second.addLast(tmp);
                counter ++;
                flag = 1;
            }
            else if (first.getFirst() == 0 && second.getFirst() == 9)
            {
                int tmp = first.removeFirst();
                first.addLast(tmp);
                first.addLast(second.removeFirst());
                counter ++;
                flag = 1;
            }
            else if ((first.getFirst()  < second.getFirst()) && flag == 0)
=======
//        System.out.println(first);
//        System.out.println(second);
>>>>>>> 83cae44aa11ee6da0bf3f55f45a97c8ab40efe01
        int counter = 0;
        int flag = 0;
        while (first.size() != 10 && second.size() != 10)
        {
<<<<<<< HEAD
            if ((first.getFirst() == 9 && second.getFirst() == 0)){
                second.addLast(first.removeFirst());
                int tmp = second.removeFirst();
                second.addLast(tmp);
                counter ++;
                flag = 1;
            }
            else if (first.getFirst() == 0 && second.getFirst() == 9)
            {
                int tmp = first.removeFirst();
                first.addLast(tmp);
                first.addLast(second.removeFirst());
                counter ++;
                flag = 1;
            }
            else if ((first.getFirst()  < second.getFirst()) && flag == 0)
=======
            if (first.getFirst()  < second.getFirst() || (first.getFirst() == 9 && second.getFirst() == 0))
>>>>>>> bff62ac758b010a1f6385338a2330aa14fe50fdf
>>>>>>> 83cae44aa11ee6da0bf3f55f45a97c8ab40efe01
            {
                second.addLast(first.removeFirst());
                int tmp = second.removeFirst();
                second.addLast(tmp);
                counter ++;
<<<<<<< HEAD
            }
            else if ((first.getFirst()  > second.getFirst()) && flag == 0)
=======
<<<<<<< HEAD
            }
            else if ((first.getFirst()  > second.getFirst()) && flag == 0)
=======
                System.out.println(" ");
                System.out.println("first: " + first);
                System.out.println("second:  " + second);
                System.out.println(" ");
            }
            else if (first.getFirst()  > second.getFirst() || (first.getFirst() == 0 && second.getFirst() == 9))
>>>>>>> bff62ac758b010a1f6385338a2330aa14fe50fdf
>>>>>>> 83cae44aa11ee6da0bf3f55f45a97c8ab40efe01
            {
                int tmp = first.removeFirst();
                first.addLast(tmp);
                first.addLast(second.removeFirst());
                counter ++;
<<<<<<< HEAD
            }
            flag = 0;
=======
<<<<<<< HEAD
            }
            flag = 0;
=======
                System.out.println(" ");
                System.out.println("first: " + first);
                System.out.println("second:  " + second);
                System.out.println(" ");
            }
>>>>>>> bff62ac758b010a1f6385338a2330aa14fe50fdf
>>>>>>> 83cae44aa11ee6da0bf3f55f45a97c8ab40efe01
        }
        if (first.size() == 10)
            System.out.println("first " + counter);
        else if (second.size() == 10)
            System.out.println("second " + counter);
    }
}