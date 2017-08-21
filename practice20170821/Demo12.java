package practice20170821;

//数值的整数次方 
//题目描述
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。

public class Demo12 {
	/*
	 * 要考虑负数
	 */
//    public static double Power(double base, int exponent) {
//        double res=1;
//        int exp = Math.abs(exponent);
//        for(int i=1; i <= exp; i++) {
//        	res *= base;
//        }
//        if(exponent>0)
//        	return res;
//        else
//        	return 1.0/res;
//    }
	/**
	 * 用二进制数来做
	 */
	public static double Power(double base, int n) {
		double res = 1,curr = base;
		int exponent;
		if(n>0) {
			exponent = n;
		}else if(n<0) {	
			if(base == 0)									//如果指数为负数，那么基数不能为0，否则抛出异常
				throw new RuntimeException("分母不能为0");
			exponent = -n;
		}else {
			return 1;
		}
		while(exponent != 0) {
			if((exponent&1)==1)			//如果exponent的二进制数最后一位为1
				res*=curr;				//指数
			curr*=curr;					//基数翻倍(因为指数移位后比如11第二位就相当于2，所以一次运算就是平方，以此类推)
			exponent>>=1;				//基数移位
		}
		return n>=0?res:(1/res);		//根据n是正是负得出最后的表达式
	}
    public static void main(String[] args) {
		System.out.println(Power(2,4));
	}
}
