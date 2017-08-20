package practice20170820;

//跳台阶 
//题目描述
//一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

public class Demo7 {
	/*
	 * 自己写的错误方法
	 */
//    public static int JumpFloor(int target) {
//    	int solution = 0;
//    	for(int i=0;i<=target;i++) {
//    		for(int j=0;j<=target/2+1;j++) {
//    			if((i+2*j)==target)
//    				solution++;
//    			if((i+2*j)>target)
//    				continue;
//    		}
//    	}
//    	for(int i=0;i<=target/2+1;i++) {
//    		for(int j=0;j<=target;j++) {
//    			if((2*i+j)==target)
//    				solution++;
//    			if((2*i+j)>target)
//    				continue;
//    		}
//    	}
//    	return solution;
//    }
	/*
	 * 这题的思路应该类似于斐波那契数列
	 * 14ms   8144k
	 */
	 public static int JumpFloor(int target) {
		 if(target<=1)
			 return target;
		 int[] record = new int[target+1];
		 record[0] = 0;
		 record[1] = 1;
		 record[2] = 2;
		 for(int i=3; i <=target; i++) {
			 record[i] = record[i-1]+record[i-2];
		 }
		 return record[target];
	}
    public static void main(String[] args) {
		System.out.println(JumpFloor(3));
	}
}
