package practice20170818;

//替换空格 
//题目描述
//	请实现一个函数，将一个字符串中的空格替换成“%20”。
//	例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。

public class Demo2 {
	/*
	 * 将StringBuffer转换成String，然后用substring方法取值
	 * 自己的方法，19ms
	 */
//    public static String replaceSpace(StringBuffer str) {
//    	String stri = str.toString();
//    	String replace = "";
//    	System.out.println(stri+replace);
//    	int index = 0;
//    	for(int i = 0; i < stri.length(); i++) {
//    		if(stri.charAt(i)==' ') {
//    			replace = replace.substring(0, index)+"%20";
//    			System.out.println(replace);
//    			index +=2;
//    		}else {
//    			replace += stri.charAt(i);
//    			System.out.println(replace);
//    			}
//    		index++;
//    	}
//    	return replace;
//    }
    /*
     * 直接用StringBuffer来做
     * 最后转换成String
     */
		public static String replaceSpace(StringBuffer str) {
				if(str==null){
						return null;
					}
				StringBuilder newStr = new StringBuilder();
					for(int i=0;i<str.length();i++){
				if(str.charAt(i)==' '){
					newStr.append('%');
					newStr.append('2');
					newStr.append('0');
				}else{
					newStr.append(str.charAt(i));
				}
			}
			return newStr.toString();
		}
    
    
    public static void main(String[] args) {
		StringBuffer str = new StringBuffer();
		str.append("hello world");
		System.out.println(replaceSpace(str));
	}
}
