package cn.jxh.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * LIST排序
 */
public class ListCollectionTest {

    public static void main(String[] args) {

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(0);
        integerList.add(9);
        integerList.add(7);
        integerList.add(6);
        integerList.add(2);
        integerList.add(4);
        integerList.add(8);
        integerList.add(3);
        integerList.add(5);
//
//        Collections.sort(integerList);
//
//        for (Integer i : integerList) {
//            System.out.println(i);
//        }


        Collections.sort(integerList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2)  {
                //int compare(T o1, T o2);，它接受两个参数：o1，o2. o2表示list排序前的前值，o1为后值
                if (o1 < o2) {
                    return -1;
                } else if (o1 > o2) {
                    return 1;
                } else {
                    return 0;
                }
//                if (o1.equals(o2)) {
//                    return 0;
//                } else if (o1 > o2) {
//                    //o2为前值，o1为后值；这里理解为：后值比前值大，则不交换位置,等价从小到大排序
//                    //如果这里返回 -1，则为从大到小排序
//                    return 1;
//                } else {
//                    //后值比前值小，则交换位置
//                    return -1;
//                }

            }
        });

        for (Integer i : integerList) {
            System.out.println(i);
        }

    }

}
