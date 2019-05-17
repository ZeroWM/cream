package interview;/**
 * Created by wm on 2019/5/9.
 */

/**
 * @program: cream
 * @description: 排序
 * @author: WangMei
 * @create: 2019-05-09 21:25
 **/
public class Sort {

    /**
     * 冒泡排序
     * @param a
     */
    public static void bubbleSort(int []a){
        int len=a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){//注意第二重循环的条件
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }



    /**
     * 插入排序
     * @param array
     */
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

    /**
     * 希尔排序
     * @param a
     */
    public static void sheelSort(int [] a){
        int len=a.length;//单独把数组长度拿出来，提高效率
        while(len!=0){
            len=len/2;
            for(int i=0;i<len;i++){//分组
                for(int j=i+len;j<a.length;j+=len){//元素从第二个开始
                    int k=j-len;//k为有序序列最后一位的位数
                    int temp=a[j];//要插入的元素
                    while(k>=0&&temp<a[k]){//从后往前遍历
                        a[k+len]=a[k];
                        k-=len;//向后移动len位
                    }
                    a[k+len]=temp;
                }
            }
        }
    }


    /**
     * 选择排序
     * @param a
     */
    public  static void selectSort(int[]a){
        final int s = 0 ;
        int len=a.length;
        for(int i=0;i<len;i++){//循环次数
            int value=a[i];
            int position=i;
            for(int j=i+1;j<len;j++){//找到最小的值和位置
                if(a[j]<value){
                    value=a[j];
                    position=j;
                }
            }
            a[position]=a[i];//进行交换
            a[i]=value;
        }
    }



    public static void main(String[] args) {

        int[] array = {1,4,6,7,3,2,9};
        selectSort(array);
        for (int a : array){
            System.out.println(a);
        }
    }
}
