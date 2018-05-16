public class Sunday {
	public static void main(String[] args) {
		String a = "make American great again!";
		String b = "t again!";
		System.out.println(sundayMatch(a, b));
	}
	
	static int sundayMatch(String matched_str, String match_str) {
		int i = 0, j = 0;
		int md_len = matched_str.length();
		int m_len = match_str.length();
		int rear;
		while(true) {
			i = 0;
			while(matched_str.charAt(j)==match_str.charAt(i)) {
				i++;
				j++;
				if(i>=m_len) {
					return j-i+1;
				}
				if(j>=md_len) {
					return -1;
				}
			}
			rear = j - i + m_len;
			j = rear + 1;
			for(i=1;i<m_len;i++) {
				if(match_str.charAt(m_len - i) == matched_str.charAt(rear)) {
					j = rear - m_len + i;
					break;
				}
			}
		}
	}
}