public class Sunday{
	public static void main(String[] args) {
		String a = "believe";	//主串
		String b = "lie";			//模式串
		System.out.println(sundayMatch(a, b));	// -1表示不匹配，正数表示模式串在主串中第一次出现的位置
	}
	
	static int sundayMatch(String s, String p) {
		int i = 0, j = 0;
		int s_len = s.length();
		int p_len = p.length();
		int rear;
		while(true) {
			i = 0;
			while(s.charAt(j)==p.charAt(i)) {
				i++;
				j++;
				if(i>=p_len) {
					return j-i+1;
				}
				if(j>=s_len) {
					return -1;
				}
			}
			rear = j - i + p_len;
			j = rear + 1;
			for(i=1;i<p_len;i++) {
				if(p.charAt(p_len - i) == s.charAt(rear)) {
					j = rear - p_len + i;
					break;
				}
			}
		}
	}
}