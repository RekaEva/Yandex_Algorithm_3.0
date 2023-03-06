package task20;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

//public class task20 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s_set = reader.readLine();
//        int set = Integer.valueOf(s_set);
//        ArrayList<Integer> array = new ArrayList<Integer>();
//        String str = reader.readLine();
//        String [] str1 = str.split(" ");
//        int i = 0;
//        while (i < set)
//        {
//            int n =  Integer.valueOf(str1[i]);
//            array.add(n);
//            i++;
//        }
//        heapify(array);
//        System.out.println(array);
//    }
//
//    private static ArrayList<Integer>  heapify(ArrayList<Integer> arrayRef)
//    {
//        ArrayList<Integer> heap = new ArrayList<Integer>();
//
//        return (heap);
//    }
//
//    private static void Insert(int k, ArrayList<Integer> myHeapRef)
//    {
//        myHeapRef.add(k);
//        int pos = myHeapRef.size() - 1 ;
//        while (pos > 0 && myHeapRef.get(pos) > myHeapRef.get(((pos - 1) / 2 )))
//        {
//            int tmp = myHeapRef.get(pos);
//            myHeapRef.set(pos,myHeapRef.get(((pos - 1) / 2 )));
//            myHeapRef.set(((pos - 1) / 2 ), tmp);
//            pos = ((pos - 1) / 2 );
//        }
//    }
//}


// Реализация пирамидальной сортировки на Java
public class task20
{
    public void sort(int arr[])
    {
        int n = arr.length;

        // Построение кучи (перегруппируем массив)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // Один за другим извлекаем элементы из кучи
        for (int i=n-1; i>=0; i--)
        {
            // Перемещаем текущий корень в конец
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Вызываем процедуру heapify на уменьшенной куче
            heapify(arr, i, 0);
        }
    }

    // Процедура для преобразования в двоичную кучу поддерева с корневым узлом i, что является
// индексом в arr[]. n - размер кучи
    void heapify(int arr[], int n, int i)
    {
        int largest = i; // Инициализируем наибольший элемент как корень
        int l = 2*i + 1; // левый = 2*i + 1
        int r = 2*i + 2; // правый = 2*i + 2

        // Если левый дочерний элемент больше корня
        if (l < n && arr[l] > arr[largest])
            largest = l;

        // Если правый дочерний элемент больше, чем самый большой элемент на данный момент
        if (r < n && arr[r] > arr[largest])
            largest = r;
        // Если самый большой элемент не корень
        if (largest != i)
        {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Рекурсивно преобразуем в двоичную кучу затронутое поддерево
            heapify(arr, n, largest);
        }
    }

    /* Вспомогательная функция для вывода на экран массива размера n */
    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Управляющая программа
    public static void main(String args[])
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;

       task20 ob = new task20();
       ob.sort(arr);
//        sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
    }
}
//
//
//    BufferedReader reader = new BufferedReader(fr);
//    // считаем сначала первую строку
//    String line = reader.readLine();
//            while (line != null) {
//                    System.out.println(line);
//                    // считываем остальные строки в цикле
//                    line = reader.readLine();
//                    }