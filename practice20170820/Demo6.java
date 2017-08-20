package practice20170820;

//斐波那契数列 
//题目描述
//大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项。
//n<=39

public class Demo6 {
	/**
	 * 自己写的，但是因为重复计算，所以耗时有点多，800+ms
	 */
//    public static int Fibonacci(int n) {
//	    	if(n == 0)
//	    		return 0;
//	    	if(n==1||n==2)
//	    		return 1;
//	    	return Fibonacci(n-1)+Fibonacci(n-2);
//
//    }

    /**
     * 11ms
     * @return
     */
   public static int Fibonacci(int n) {
	   if(n <= 1) {							//不能省略if判断，因为如果n小于等于1的时候，record[1]可能会溢出
		   return n;
	   }
	   int[] record = new int[n+1];
	   record[0]=0;
	   record[1]=1;
	   for(int i=2;i<=n;i++) {
		   record[i] = record[i-1]+record[i-2];
	   }
	   return record[n];
}
   public static void main(String[] args) {
		System.out.println(Fibonacci(8));
	}
    
}
