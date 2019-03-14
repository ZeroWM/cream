package collection;/**
 * Created by wm on 2019/3/14.
 */

import java.util.ArrayList;

/**
 * @program: cream
 * @description: 袋鼠
 * @author: WangMei
 * @create: 2019-03-14 10:49
 **/
public class Gerbil {
    private int gerbilNumber;
    private void hope(){};

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Gerbil>();
        arrayList.add(new Gerbil());
        for(int i = 0 ; i < arrayList.size() ; i++){
            Gerbil gerbil = (Gerbil) arrayList.get(i);
            gerbil.hope();
        }
    }
}

