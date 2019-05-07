package interview;/**
 * Created by wm on 2019/5/7.
 */

/**
 * @program: cream
 * @description: Algorithm
 * @author: WangMei
 * @create: 2019-05-07 11:41
 **/
public class fibanaAlgorithm {

    public static void main(String[] args) {
        long[] f = new long[50];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2 ; i < 50 ; i++){
            f[i] = f[i-2] + f[i-1];
        }
        System.out.println(f[49]);
    }
}
