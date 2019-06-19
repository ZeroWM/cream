package lambdaDemo;

import lombok.*;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LamdbdaExample {

  // 资料地址 https://segmentfault.com/a/1190000009186509

  public static void main(String[] args) {

    /** ::号前面是目标引用，后面是方法 ::前面的对象，后面的方法是它的自带方法或者类内方法 */
    //      Comparator c = (Person p1,Person p2)->p1.getAge().compareTo(p2.getAge());
    Comparator c1 = Comparator.comparing(Person::getAge);

    Runnable r = () -> System.out.println("hello world");

    // old way
    //      List<Integer> list = Arrays.asList(1,2,3,4,5,6);
    //      int sum = 0;
    //      for(Integer n : list){
    //          int x = n * n;
    //          sum = sum + x;
    //      }
    //      System.out.println(sum);


    // new way
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    int sum = list.stream().map(x -> x * x).reduce((x, y) -> x + y).get();
    System.out.println(sum);
  }


}

@Data
class Person {
  private Integer age;
}
