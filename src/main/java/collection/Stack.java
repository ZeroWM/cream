package collection;/**
 * Created by wm on 2019/3/19.
 */

import java.util.LinkedList;

/**
 * @program: cream
 * @description: 11.8 stack
 * @author: WangMei
 * @create: 2019-03-19 11:04
 **/
public class Stack<T> {

    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T v) {
        storage.addFirst(v);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }

}
