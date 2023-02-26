package find_min_right;

import java.util.*;



public class find_min {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int set = Integer.valueOf(in.nextLine());
//        String input = in.nextLine();
//        String[] str = input.split(" ");
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < set; i++) {
////            mp.x = i;
//            map.put(i, Integer.valueOf(str[i]));
//        }
//        System.out.println(map);
//        System.out.println(map.get(1));
//        Stack<Map<Integer, Integer>> stack = new Stack<>();

        class CustomEntry<K, V> {

            private K key;
            private V value;

            CustomEntry(K key, V value) {
                this.key = key;
                this.value = value;
            }

            K getKey() {
                return key;
            }

            V getValue() {
                return value;
            }

            void setKey(K key) {
                this.key = key;
            }

            void setValue(V value) {
                this.value = value;
            }
        }

        Stack<CustomEntry<Integer, Integer>> entryStack = new Stack<>();
        entryStack.push(new CustomEntry<>(5, 5));
        System.out.println(entryStack.pop().getKey());
    }
}


//
//        int fin[] = new int[set] ;
//        Arrays.fill(fin, -1);
//        Map<Integer, Integer> map2 = new HashMap<>();
//        for (int i = 0; i < set; i++)
//        {
//            map2 = stack.lastElement();
//            if (!stack.empty() && map2.get(0) <= map.get(i))
//            {
//                stack.push(map);
//            }
//            else if (!stack.empty() && map2.get(0) > map.get(i))
//            {
//                fin[i - 1] =  i;
//                stack.pop();
//            }
//            else{
//                stack.push(map);
//            }
//        }
//        for (int i = 0; i < fin.length; i++) {
//            System.out.print(fin[i] + " ");
//        }
//    }

//    public static class mp {
//        public static  int key;
//        public static int val;
//
//        public mp(int key, int val) {
//            this.key = x;
//            this.y = y;
//        }
//    }

//}
//65 51 79 36 2 47 92 30 25 94

