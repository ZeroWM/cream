package interview; /**
 * Created by wm on 2019/5/7.
 */

/**
 * @program: switch的坑
 * @description: interview.ControlStruture
 * @author: WangMei
 * @create: 2019-05-07 11:31
 **/
public class ControlStruture {

    public  static  int testSwitch(int i ){
        int result = 0;
        switch (i){
            case 1:
                result = result + i;
            case 2:
                result = result + i*2;
            case 3:
                result = result + i*3;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(testSwitch(1));
    }
}
