package collection;/**
 * Created by wm on 2019/3/19.
 */

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @program: cream
 * @description: 11.9 SetOfInteger
 * @author: WangMei
 * @create: 2019-03-19 11:49
 **/
public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new HashSet<Integer>();
        for (int i = 0; i < 10000 ; i++)
            intset.add(rand.nextInt(30));

        System.out.println(intset);

    }
}
