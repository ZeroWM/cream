package interview;/**
 * Created by wm on 2019/5/9.
 */


/**
 * @program: cream
 * @description: 插入排序
 * @author: WangMei
 * @create: 2019-05-09 17:14
 **/
public class InsertSort {

    private static void insertSort(int[] array){
        int len = array.length;
        int insertNum;
        for(int i = 1 ; i<len ; i++){
            insertNum = array[i];
            int j = i -1;
            while (j>=0 && array[j]>insertNum){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] array = {1,4,6,7,3,2,9};
        insertSort(array);
        for (int a : array){
            System.out.println(a);
        }
    }
}
