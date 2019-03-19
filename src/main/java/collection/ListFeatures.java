package collection;/**
 * Created by wm on 2019/3/14.
 */

import java.util.*;

/**
 * @program: cream
 * @description: 11.5 list
 * @author: WangMei
 * @create: 2019-03-14 15:22
 **/
public class ListFeatures {


//    public static void main(String[] args) {
//        List<Pet> pets = Pets.arrayList(7);
//        System.out.println("2." + pets.toString());
//        Hamster h = new Hamster();
//        pets.add(h);
//        System.out.println("3." + pets.contains(h));
//        Pet p = pets.get(2);
//        System.out.println("4." + p.toString() + "---------" + pets.indexOf(p));
//        Pet cymic = new Cymric();
//        pets.add(cymic);
//        System.out.println("5." + pets.indexOf(cymic));
//        pets.remove(cymic);
//        System.out.println("6." + pets.remove(cymic));
//        List<Pet> sub = pets.subList(1,4);
//        System.out.println("7." + sub.toString());
//        System.out.println("8." +  pets.containsAll(sub));
//        Collections.shuffle(sub);
//        System.out.println("9." + sub.toString());
//        List<Pet> copy = new ArrayList<Pet>(pets);
//        sub = Arrays.asList(pets.get(1),pets.get(4));
//        System.out.println("10." + sub.toString());
//        copy.retainAll(sub);
//        System.out.println("11." + copy.toString());
//        copy.remove(1);
//        System.out.println("12." + copy.toString());
//        copy.removeAll(sub);
//        System.out.println("13." + copy.toString());
//
//        System.out.println("14." + pets.isEmpty());
//        pets.clear();
//        System.out.println("15." + pets.isEmpty());
//        pets.addAll(Pets.arrayList(4));
//        Object[] o = pets.toArray();
//        System.out.println("16." + o[3]);
//
//
//    }

    /**
     * Iterator遍历
     * @param args
     */
    public static void main(String[] args) {
        List<Pet> petses = Pets.arrayList(9);
        Iterator<Pet> iterator = petses.iterator();
        while (iterator.hasNext()){
            Pet p = iterator.next();
            System.out.println(p.toString());
        }
        iterator = petses.iterator();
        for(int i = 0 ; i < 2 ; i++){
            iterator.next();
            iterator.remove();

        }
        System.out.println(petses.toString());


    }


    /**
     * 实现sort reverse shuffle
     */
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("请输入N个字符：");
//        String str=sc.next();
//        String[] arr=str.split(",");
//
//        List<String> list=new ArrayList<String>();
//        for(int i=0;i<arr.length;i++){
//            list.add(arr[i]);
//        }
//        System.out.println("原序输出：  "+list);
//
//        Collections.sort(list);
//        System.out.println("升序输出： "+list);
//
//        Collections.sort(list,new Comparator<String>(){
//            public int compare(String o1, String o2) {
//                return o2.compareTo(o1);
//            }});
//        System.out.println("降序输出：   "+list);
//
//        Collections.reverse(list);
//        System.out.println("反转指定列表中元素的顺序     "+list);
//
//        Collections.shuffle(list);
//        System.out.println("随机序列" + list);
////        Set set = new ArraySet(list);
////        HashSet<String> set=new HashSet<String>(list);
////        System.out.println("无序输出：  "+set);
////        升序  Collections.sort(list)    降序  Collections.reserve(list)   随机  Collections.shuffle(list)
//
//    }


}

class Pet{
    public Pet(){

    }
}

class Hamster extends Pet{
}
class Rat extends Pet{
}
class Manx extends Pet{
}
class Cymric extends Pet{
}
class Mutt extends Pet{
}
class Pug extends Pet{
}


class Pets{
    public static List<Pet> arrayList(Integer number){
        List<Pet> pets = new ArrayList<Pet>();
        pets.add(new Rat());
        pets.add(new Manx());
        pets.add(new Cymric());
        pets.add(new Mutt());
        pets.add(new Pug());
        pets.add(new Cymric());
        pets.add(new Pug());
        return pets;
    }
}



