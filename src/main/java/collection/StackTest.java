package collection;/**
 * Created by wm on 2019/3/19.
 */
/**
 * @program: cream
 * @description: StackTest
 * @author: WangMei
 * @create: 2019-03-19 11:11
 **/
public class StackTest {
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        for(String s : "My dog has fleas".split(" "))
            stack.push(s);

        while (!stack.empty()){
            System.out.print(stack.pop() + " ");
        }

    }
}
