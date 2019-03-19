package collection;/**
 * Created by wm on 2019/3/15.
 */

import java.util.LinkedList;

/**
 * @program: cream
 * @description: 11.7
 * @author: WangMei
 * @create: 2019-03-15 18:56
 **/
public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<Pet>(Pets.arrayList(5));
        System.out.println(pets.toString());
        System.out.println("getFirst "  + pets.getFirst());
        System.out.println("element " + pets.element());
        System.out.println("peek " + pets.peek());
        System.out.println("remove " + pets.remove());
        System.out.println("removeFirst " + pets.removeFirst());
        System.out.println("poll " + pets.poll());
        pets.addFirst(new Rat());
        System.out.println("addFirst" + pets);
        pets.offer(new Cymric());
        System.out.println("Cymric" + pets);
        pets.add(new Manx());
        System.out.println("Manx" + pets);
        System.out.println("removeLast" + pets.removeLast());
    }
}
