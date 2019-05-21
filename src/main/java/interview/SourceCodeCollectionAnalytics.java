package interview;/**
 * Created by wm on 2019/5/12.
 */

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cream
 * @description: ss
 * @author: WangMei
 * @create: 2019-05-12 11:24
 **/
public  class SourceCodeCollectionAnalytics {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        HashMap m = new HashMap();
        m.containsKey("key");
        ArrayList arrayList = new ArrayList();
        arrayList.contains("");
        String s = "hello";
        SourceCodeCollectionAnalytics t = new SourceCodeCollectionAnalytics();
        t.func1(s);
        System.out.println("----------s:" + s);
        StringBuilder s2 = new StringBuilder("hello");
        t.func(s2);
        System.out.println("-----------s2:" + s2);


        //map常见的实现类：
        // Hashtable
        // HashMap, ConcurrentHashMap, LinkedHashMap, WeakHashMap
        // EnumMap
        // Properties
        // TreeMap

        HashMap<String, Integer> map = new HashMap<String, Integer>();
//
        map.put("语文", 1);
        map.put("数学", 2);
//        map.put("英语", 3);
//        map.put("历史", 4);
//        map.put("政治", 5);
//        map.put("地理", 6);
//        map.put("生物", 7);
//        map.put("化学", 8);
//        map.put("语文1", 1);
//        map.put("数学1", 2);
//        map.put("英语1", 3);
//        map.put("历史1", 4);
//        map.put("政治1", 5);
//        map.put("地理1", 6);
//        map.put("生物1", 7);
//        map.put("化学1", 8);
//        map.put("语文1", 1);
//        map.put("语文2", 1);
        map.size();
        map.get("语文");
        map.containsKey("");
        map.containsValue("");

        ConcurrentHashMap<String ,String> map1 = new ConcurrentHashMap();
        map1.put("语文", "1");
        map1.put("数学", "2");
        map1.put("英语", "3");
        map1.put("历史", "4");
        map1.put("政治", "5");


        map1.get("1");
        map1.size();
        map1.containsKey("");

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<String, String>();
        linkedHashMap.put("语文", "1");
        linkedHashMap.put("数学", "2");
        linkedHashMap.put("英语", "3");

        linkedHashMap.get("语文");
        linkedHashMap.size();

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("wm");
        list1.add("I");
        list1.add("love");
        list1.add("u");
        list1.add("wm");
        list1.add("I");
        list1.add("love");
        list1.add("u");
        list1.add("wm");
        list1.add("I");
        list1.add("love");
        list1.add("u");
        list1.get(10);
        list1.size();


        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("wm");
        list2.add("I");
        list2.add("love");
        list2.add("u");
        list2.add("2");
        list2.retainAll(list1);
        list2.removeAll(list1);

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("wm");
        linkedList.add("I");
        linkedList.add("love");
        linkedList.get(10);
        linkedList.getFirst();





    }



    void func1(String ss){
        ss ="world";
    }
    void func(StringBuilder ss){
        ss.append("world");
    }
}

