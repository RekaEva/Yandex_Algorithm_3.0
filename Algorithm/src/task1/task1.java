package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String str = "";
        while(line != null)
        {
//            System.out.println("line: " + line);
            str = str + line;
//            System.out.println("str: " + str);
            line = reader.readLine();
        }
//        System.out.println(str);
        Map<Character, Integer> map = new TreeMap<>();
        for (char key : str.toCharArray())
        {
            if (key == ' ' || key == '\n')
                continue;
            if (map.containsKey(key))
                map.replace(key, map.get(key) + 1);
            else
                map.put(key, 1);
        }
//        System.out.println(map);
        int max = 0;
        for (int val : map.values())
        {
            if (max < val)
                max = val;
        }
//        System.out.println(max);
        for (int level = max; level > 0; level--)
        {
            String level_string = "";
            for (int freq : map.values())
            {
                if (freq >= level)
                    level_string += '#';
                else
                    level_string += ' ';
            }
            System.out.println(level_string);
        }
        for (char i : map.keySet()) {
            System.out.print(i);
        }
        System.out.println("");
    }
}
