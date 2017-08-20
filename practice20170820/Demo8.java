package practice20170820;

//变态跳台阶
//题目描述
//一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

public class Demo8 {
	/*
	 * 11ms
	 */
    public static int JumpFloorII(int target) {
        if(target<=2) {
        	return target;
        }
        int[] record = new int[target+1];
        record[0] = 0;
        record[1] = 1;
        for(int i=2;i<=target;i++) {
        	int j = i;
        	record[i]=1;					//最大步长是i，则一步
        	while(j>0) {					//加上如果第一步是1，则后面是JumpFloorII(target-1),
        									//如果第一步是2，则后面是JumpFloorII(target-2),
        									//一直累和
        		record[i] += record[j-1];
        		j--;
        	}
        }
        return record[target];
    }
    /**
     * 或者直接使用数学的方法分析，除了最后一个台阶必须站在上面，其他的n-1个台阶都有1/2的可能站在上面或者1/2的可能性不站，
     * 即n个台阶的可能是2^(n-1)
     * @param args
     */
    public static void main(String[] args) {
		System.out.println(JumpFloorII(20));
	}
}
