package Dynamic_programming;

import java.util.HashMap;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.valueOf(in.nextLine());
//        int ans;
        int ans = fcashe(n);
        System.out.println(ans);

    }
    private static HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

    private static int fcashe(int n){
        if(!cache.containsKey(n)){//Проверяем, находили ли мы данное значение
            cache.put(n, f(n)); //Если нет, то находим и записываем в таблицу
        }
        return cache.get(n);
    }
    private static int f(int n){
        if(n==0 || n==1) return 1; // Проверка на начальное значение

        if(n%2==0){ //Проверка на чётность
            return f(n/2)+f(n/2-1); // Вычисляем по формуле для чётных индексов,
            //  ссылаясь на предыдущие значения
        }else{
            return f((n-1)/2)-f((n-1)/2-1);  // Вычисляем по формуле для нечётных
            // индексов, ссылаясь на предыдущие значения
        }
    }
}
