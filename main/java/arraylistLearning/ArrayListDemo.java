package arraylistLearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));

        list.add(1,10);
        System.out.println(list.get(1));
        System.out.println("Contains :" +list.contains(10));
        System.out.println("IndexOf: " + list.indexOf(10));

//        ⭐ Core Methods
//        add(e) → insert at end
//        add(index, e) → insert at position
//        get(index) → access element
//        set(index, e) → update element
//        remove(index) → delete by index
//        size() → current size
//
//👉 These 6 alone solve 80% of problems
//
//⭐ Useful Extras
//        contains(x) → check existence
//        indexOf(x) → find index
//        clear() → reset list
    }
}
