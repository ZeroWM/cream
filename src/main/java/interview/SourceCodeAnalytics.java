package interview;/**
 * Created by wm on 2019/5/12.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: cream
 * @description: ss
 * @author: WangMei
 * @create: 2019-05-12 11:24
 **/
public  class SourceCodeAnalytics {
    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger();
        HashMap m = new HashMap();
        m.containsKey("key");
        ArrayList arrayList = new ArrayList();
        arrayList.contains("");
        String s = "hello";
        SourceCodeAnalytics t = new SourceCodeAnalytics();
        t.func1(s);
        System.out.println("----------s:" + s);
        StringBuilder s2 = new StringBuilder("hello");
        t.func(s2);
        System.out.println("-----------s2:" + s2);


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


    }



    void func1(String ss){
        ss ="world";
    }
    void func(StringBuilder ss){
        ss.append("world");
    }
}

