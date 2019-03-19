package collection;/**
 * Created by wm on 2019/3/15.
 */

import java.util.*;

/**
 * @program: cream
 * @description: 11.6 迭代器 CrossContainerIteration
 * @author: WangMei
 * @create: 2019-03-15 16:15
 **/
public class CrossContainerIteration {
    public static void display(Iterator<Pet> it){
        while (it.hasNext()){
            Pet p = it.next();
            System.out.println(p.toString());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Pet> pets = Pets.arrayList(8);
        ArrayList<Pet> petsA = new ArrayList<Pet>(pets);
        LinkedList<Pet> petsLL = new LinkedList<Pet>(pets);
        HashSet<Pet> hashSet = new HashSet<Pet>(pets);

        display(petsA.iterator());
        display(petsLL.iterator());
        display(hashSet.iterator());

    }
}
