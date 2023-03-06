<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
package find_min_right;
>>>>>>> bff62ac758b010a1f6385338a2330aa14fe50fdf
>>>>>>> 83cae44aa11ee6da0bf3f55f45a97c8ab40efe01

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class easy {
        public static void main(String[] args) throws IOException  {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int set = Integer.valueOf(reader.readLine());
            String line = reader.readLine();
            String[] str = line.split(" ");
            Stack<Integer> key = new Stack<>();
            Stack<Integer> val = new Stack<>();
            for (int i = set - 1; i >= 0; i--) {
                key.push(i);
                val.push(Integer.valueOf(str[i]));
            }
            int fin[] = new int[set] ;
            Arrays.fill(fin, -1);
            Stack<Integer> stack_v = new Stack<>();
            Stack<Integer> stack_k = new Stack<>();
            int i = 0;
            while (!val.empty() || i < set)
            {
                if (!stack_v.empty() &&  !stack_k.empty() && stack_v.lastElement() <= val.lastElement())
                {
                    stack_v.push(val.pop());
                    stack_k.push(key.pop());
                }
                else if (!stack_v.empty() && !stack_k.empty() && stack_v.lastElement() > val.lastElement())
                {
                    while (!stack_v.empty() && (stack_v.lastElement() > val.lastElement() || stack_v.empty()))
                    {
                        fin[stack_k.pop()] =  key.lastElement();
                        stack_v.pop();
                    }
                }
                else{
                    stack_v.push(val.pop());
                    stack_k.push(key.pop());
                }
                i++;
            }
            for (int value : fin) {
                System.out.print(value + " ");
            }
        }
}
