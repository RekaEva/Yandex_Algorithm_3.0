package task19;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ML {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_set = reader.readLine();
        int set = Integer.valueOf(s_set);
        int i = 0;
        ArrayList<Integer> myHeap = new ArrayList<Integer>();
        while(i < set)
        {

            String str = reader.readLine();
            if (Character.digit(str.charAt(0), 10) == 0)
            {
                String [] str1 = str.split(" ");
                int k =  Integer.valueOf(str1[1]);
                Insert(k, myHeap);
            }
            else if (Character.digit(str.charAt(0), 10) == 1)
            {
                int ans = Extract(myHeap);
                System.out.println(ans);
            }
            i++;
        }
    }

    private static void Insert(int k, ArrayList<Integer> myHeapRef)
    {
        myHeapRef.add(k);
        int pos = myHeapRef.size() - 1 ;
        while (pos > 0 && myHeapRef.get(pos) < myHeapRef.get(((pos - 1) / 2 )))
        {
            int tmp = myHeapRef.get(pos);
            myHeapRef.set(pos,myHeapRef.get(((pos - 1) / 2 )));
            myHeapRef.set(((pos - 1) / 2 ), tmp);
            pos = ((pos - 1) / 2 );
        }
    }
    private static int Extract( ArrayList<Integer> myHeapRef)
    {
        int ans;
        int index = 0;
        int my_max = Collections.max(myHeapRef);
        index = myHeapRef.indexOf(my_max);
        ans = my_max;
        myHeapRef.remove(index);
        return (ans);
    }
}
