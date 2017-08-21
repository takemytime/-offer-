package practice20170821;

//矩形覆盖 
//题目描述
//我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？

public class Demo10 {
	/*
	 * 同斐波那契数列
	 */
    public int RectCover(int target) {
    	if(target<=2)
    		return target;
    	int[] record = new int[target+1];
    	record[0] = 0;
    	record[1] = 1;
    	record[2] = 2;
    	for(int i = 3; i<=target; i++) {
    		record[i] = record[i-1] + record[i-2];
    	}
    	return record[target];
    }
}
