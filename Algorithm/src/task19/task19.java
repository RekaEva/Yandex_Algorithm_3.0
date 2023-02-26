package task19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class task19 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_set = reader.readLine();
        int set = Integer.valueOf(s_set);
        int i = 0;
        ArrayList<Integer> myHeap = new ArrayList<Integer>();
        while(i < set)
        {
            String str = reader.readLine();
            if (Character.digit(str.charAt(0), 10) == 0) // Insert
            {
                String [] str1 = str.split(" ");// вызываем метод Insert
                int k =  Integer.valueOf(str1[1]);
                Insert(k, myHeap);
            }
            else if (Character.digit(str.charAt(0), 10) == 1)
            {
                // вызываем метод Extract
               int ans = Extract(myHeap);
                System.out.println(ans);
            }
            i++;
//          System.out.println(myHeap);
        }
//        System.out.println(myHeap);
    }

    private static void Insert(int k, ArrayList<Integer> myHeapRef)
    {
        myHeapRef.add(k); // должно передаваться по ссылке.
        int pos = myHeapRef.size() - 1 ; // index position;
        while (pos > 0 && myHeapRef.get(pos) < myHeapRef.get(((pos - 1) / 2 )))
        {
            int tmp = myHeapRef.get(pos);
            myHeapRef.set(pos,myHeapRef.get(((pos - 1) / 2 )));
            myHeapRef.set(((pos - 1) / 2 ), tmp);
            pos = ((pos - 1) / 2 );
        }
    }
//    private static int Extract( ArrayList<Integer> myHeapRef)
//    {
//        System.out.println("qweer");
//        int ans;
//        int index;
//        int size = myHeapRef.size();
//        int levels = log2(size) + 1;
//        int max_el = (int)Math.pow(2,levels) - 1;
//        if (max_el == size)
//        {
//            //ищем ответ в последних 2^(levels - 1) индексах;
//            int num = (int)Math.pow(2,levels - 1);
//            List<Integer> tmp = myHeapRef.subList(size - num, size);
//            int my_max = Collections.max(tmp);
//            ans = my_max;
//            index = myHeapRef.indexOf(my_max);
//        }
//        else
//        {
//            // фактическое число элементов на уровне
//            // ищем ответ в последних 2^(levels - 2) + last_level_fact
//            int last_level_max = (int)Math.pow(2,levels - 1);
//            int last_level_fact = size + last_level_max - max_el;
//            int num = (int)Math.pow(2,levels - 2);
//            List<Integer> tmp = myHeapRef.subList(size - num, size);
//            int my_max = Collections.max(tmp);
//            ans = my_max;
//            index = myHeapRef.indexOf(my_max);
//        }
//        myHeapRef.remove(index);
//        return (ans);
//    }
//
//    public static int log2(int N)
//    {
//        // calculate log2 N indirectly
//        // using log() method
//        int result = (int)(Math.log(N) / Math.log(2));
//
//        return result;
//    }
//    private static int Extract( ArrayList<Integer> myHeapRef)
//    {
//        int ans = myHeapRef.get(0);
//        int i;
//        int index = 0;
//        for (i = 1; i < myHeapRef.size(); i++) {
//            if (myHeapRef.get(i) > ans) {
//                ans = myHeapRef.get(i);
//                index = i;
//            }
//        }
//        myHeapRef.remove(index);
//        return (ans);
//    }
    private static int Extract( ArrayList<Integer> myHeapRef)
    {
        int ans = myHeapRef.get(0);
//        int i;
        int index = 0;
        for (int i : myHeapRef) {
            if (i > ans) {
                ans = i;
                index = myHeapRef.indexOf(ans);
            }
        }
        myHeapRef.remove(index);
        return (ans);
    }
//    private static int Extract( ArrayList<Integer> myHeapRef)
//    {
//        int ans = myHeapRef.get(0);
//        int i;
//        int index = 0;
//        for (i = 1; i < myHeapRef.size(); i++) {
//            if (myHeapRef.get(i) > ans) {
//                ans = myHeapRef.get(i);
//                index = i;
//            }
//        }
//        myHeapRef.remove(index);
//        return (ans);
//    }
}
