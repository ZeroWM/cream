package collection;/**
 * Created by wm on 2019/3/14.
 */

import java.util.HashSet;
import java.util.Set;

/**
 * @program: cream
 * @description: SimpleCollection
 * @author: WangMei
 * @create: 2019-03-14 10:53
 **/
public class SimpleCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0 ; i <10 ; i++)
            set.add(i);
        for(Integer i : set){
            System.out.println(i + ",");
        }
    }
}
