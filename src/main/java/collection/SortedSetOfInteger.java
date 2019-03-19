package collection;/**
 * Created by wm on 2019/3/19.
 */

import java.util.*;

/**
 * @program: cream
 * @description: set
 * @author: WangMei
 * @create: 2019-03-19 15:29
 **/
public class SortedSetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<String> set1 = new HashSet<String>();
        Collections.addAll(set1,"A B C D E F G H I J K L".split(" "));
        set1.add("M");
        System.out.println("H :" + set1.contains("H"));
        System.out.println("N :" + set1.contains("N"));
        Set<String> set2 = new HashSet<String>();
        Collections.addAll(set2 , "H I J K L".split(" "));
        System.out.println("set2 in set1:" + set1.containsAll(set2));
        set1.remove("H");
        System.out.println("set1:" + set1.toString());
        System.out.println("set2 in set1:" + set1.containsAll(set2));
        set1.removeAll(set2);
        System.out.println("set1 remove set2:" + set1.toString());
        Collections.addAll(set1,"X Y Z".split(" "));
        System.out.println("add X Y Z" + set1.toString());

    }
}
