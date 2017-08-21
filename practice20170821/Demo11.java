package practice20170821;

//二进制中1的个数 
//题目描述
//输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。

public class Demo11 {
    public static int NumberOf1(int n) {
    	int num = 0;
    	while(n!=0) {
    		num++;
    		n = n&(n-1);			//减一会把最右边的1变成0，而把这位右边的0全变成1，而又与原来的与运算，相当于只把最右的1变成0，
    								//其他位不受影响，从右向左，把所有的1都变成0，即次数就是含1的个数
    		System.out.println(n);
    	}
    	return num;
    }
    public static void main(String[] args) {
		System.out.println(NumberOf1(5));
	}
}
