package practice20170822;

import java.util.ArrayList;

//调整数组顺序使奇数位于偶数前面 
//题目描述
//输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
//所有的偶数位于位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。

public class Demo13 {
	/*
	 * 运行时间：13ms 占用内存：8404k
	 */
    public  static void reOrderArray(int [] array) {
        ArrayList<Integer> sim = new ArrayList<Integer>();				//新建一个奇数的list  sim
        ArrayList<Integer> dou = new ArrayList<Integer>();				//新建一个偶数的list  dou
        for(int i=0; i<array.length; i++) {								//把传入的array[]按奇偶分别加入sim dou
        	if(array[i]%2 == 0)
        		dou.add(array[i]);
        	else
        		sim.add(array[i]);
        }
        for(int j=0; j<array.length; j++) {
        	if(!sim.isEmpty()) {										//按顺序取出sim
        		array[j] = sim.get(0);
        		sim.remove(0);
        	}else if(!dou.isEmpty()) {									//取完sim后再按顺序取出dou
        		array[j] = dou.get(0);
        		dou.remove(0);
        	}
        }
    }
    public static void main(String[] args) {
		int[] test = {1,2,5,3,6,7};
		reOrderArray(test);
		for(int i=0; i<test.length; i++) {
			System.out.print(test[i]);
		}
	}
}
