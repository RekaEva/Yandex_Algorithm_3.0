package task20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class example {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s_set = reader.readLine();
        ArrayList<Integer> array = new ArrayList<Integer>();
        String str = reader.readLine();
        String [] str1 = str.split(" ");
        int i = 0;
        int set = Integer.valueOf(s_set);
        while (i < set)
        {
            int n =  Integer.valueOf(str1[i]);
            array.add(n);
            i++;
        }
        array = sort(array);

        for (i = 0; i < array.size(); i++)
            System.out.print(array.get(i)+" ");
        System.out.println();
    }

    public static ArrayList<Integer> sort(ArrayList<Integer> array)
    {
        int n = array.size();
        for (int i = n / 2 - 1; i >= 0; i--) // для кажлого сына
        {
            heapify(array, n, i);
        }

        for (int i = n - 1; i >= 0; i--)
        {
            int tmp = array.get(0);
            array.set(0, array.get(i));
            array.set(i, tmp);
            heapify(array, i, 0);
        }
        return (array);
    }

    public static void heapify(ArrayList<Integer> arr, int n, int i)
    {
        int largest = i;
        int l = 2*i + 1;
        int r = 2*i + 2;

        if (l < n && arr.get(l) > arr.get(largest))
            largest = l;
        if (r < n && arr.get(r) > arr.get(largest))
        {
            largest = r;
        }
        if (largest != i)
        {
            int tmp = arr.get(i);
            arr.set(i, arr.get(largest));
            arr.set(largest, tmp);
            heapify(arr, n, largest);
        }
    }
}
