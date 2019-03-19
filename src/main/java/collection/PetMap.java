package collection;/**
 * Created by wm on 2019/3/19.
 */


import java.util.HashMap;

/**
 * @program: cream
 * @description: PetMap
 * @author: WangMei
 * @create: 2019-03-19 16:01
 **/
public class PetMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("My Dog","huahua");
        map.put("My Cat","ZhangXiaoLan");
        System.out.println("containsKey:" + map.containsKey("My Dog"));
        System.out.println("containsValue:" + map.containsValue("lan"));
    }
}
