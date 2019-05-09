package interview;/**
 * Created by wm on 2019/5/7.
 */

/**
 * @program: cream
 * @description: Algorithm
 * @author: WangMei
 * @create: 2019-05-07 11:41
 **/
public class FibanaAlgorithm {

    public static void main(String[] args) {
        System.out.println(getFibenamiNo(50));

    }
    private static long getFibenamiNo(int no) {
        long[] f = new long[no];
        f[0] = 1;
        f[1] = 1;
        for(int i = 2 ; i < 50 ; i++){
            f[i] = f[i-2] + f[i-1];
        }
        return f[49];
    }

}
