import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class task19_new {
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
        }
    }
    private static void Insert(int k, ArrayList<Integer> myHeapRef)
    {
        myHeapRef.add(k); // должно передаваться по ссылке.
        int pos = myHeapRef.size() - 1 ; // index position;
        while (pos > 0 && myHeapRef.get(pos) > myHeapRef.get(((pos - 1) / 2 )))
        {
            int tmp = myHeapRef.get(pos);
            myHeapRef.set(pos,myHeapRef.get(((pos - 1) / 2 )));
            myHeapRef.set(((pos - 1) / 2 ), tmp);
            pos = ((pos - 1) / 2 );
        }
    }
    private static int Extract( ArrayList<Integer> myHeapRef)
    {
        int ans = myHeapRef.get(0);
        int i;
        myHeapRef.set(0,myHeapRef.get(myHeapRef.size() - 1)); // копируем последний элемент на место первого
        int pos = 0;
        while ((pos * 2 + 1) < (myHeapRef.size() - 1 ))
        {
            int min_son_i = pos *2 + 1;
            if (myHeapRef.get(pos * 2 +2) > myHeapRef.get(min_son_i))
            {
                min_son_i = pos * 2 + 2;
            }
            if (myHeapRef.get(pos) < myHeapRef.get(min_son_i))
            {
                int tmp = myHeapRef.get(pos);
                myHeapRef.set(pos,myHeapRef.get(min_son_i));
                myHeapRef.set(min_son_i, tmp);
                pos = min_son_i;
            }
            else
                break;
        }
        myHeapRef.remove(myHeapRef.size() -1);
        return (ans);
    }
}
