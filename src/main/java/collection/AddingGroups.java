package collection;/**
 * Created by wm on 2019/3/14.
 */

import java.util.*;

/**
 * @program: cream
 * @description: 11.3
 * @author: WangMei
 * @create: 2019-03-14 11:35
 **/
public class AddingGroups {
    public static void main(String[] args) {
        Collection<Integer> collections = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        Integer[] moreInts = {6,7,8,9,10};
        collections.addAll(Arrays.asList(moreInts));
        Collections.addAll(collections,11,12,13,14,15);
        Collections.addAll(collections,moreInts);
        List<Integer> list = Arrays.asList(16,17,18,19,20);
        list.set(1,99);
        Map m = new HashMap();
        m.put("aa","bb");
        m.put(1,20);
        System.out.println(m.toString());
        System.out.println(list.toString());

    }
}
