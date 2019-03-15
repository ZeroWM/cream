package collection;/**
 * Created by wm on 2019/3/14.
 */

import java.util.*;

/**
 * @program: cream
 * @description: 11.4
 * @author: WangMei
 * @create: 2019-03-14 14:52
 **/
public class PrintingContainers {
    static Collection fill(Collection<String> collection){
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String , String> map){
        map.put("rat" , "Fuzzy");
        map.put("cat" , "Rags");
        map.put("dog" , "Bosco");
        map.put("dog" , "Spot");
        return map;
    }

    static void print(Object o){
        System.out.println(o.toString());
    }

    public static void main(String[] args) {
        print(fill(new ArrayList<String>()));
        print(fill(new LinkedList<String>()));
        print(fill(new HashSet<String>()));
        print(fill(new TreeSet<String>()));
        print(fill(new LinkedHashSet<String>()));
        print(fill(new HashMap<String, String>()));
        print(fill(new TreeMap<String, String>()));
        print(fill(new LinkedHashMap<String , String>()));
    }
}
