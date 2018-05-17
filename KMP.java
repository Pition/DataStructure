public class KMP {
	public static void main(String[] args) {
		String sub_string = "x";
		String pattern_string = "Postgraduate entrance examination";
		System.out.println(stringMatch(sub_string,pattern_string));
	}
	
	public static int nextIndex(String s) {
		int i;
		int max = 1;
		for(i=1;i<s.length()-1;i++) {
			if(s.substring(0, i).equals(s.substring(s.length()-i))) {
				max = i+1;
			}
		}
		return max;
	}
	
	/**
	 * @param s	sub string
	 * @param p	pattern string
	 * @return the starting position of the first occurrence of sub string within pattern string
	 */
	public static int stringMatch(String s, String p) {
		int s_len = s.length();
		int p_len = p.length();
		int next[] = new int[s_len];
		next[0] = 0;
		for(int m = 1; m<s_len; m++) {
			next[m] = nextIndex(s.substring(0, m));
		}
		int i=0, j=0;
		while(true) {
			while(s.charAt(j)==p.charAt(i)) {
				i++;
				j++;
				if(j == s_len) {
					return i - j + 1;
				}
				if(i == p_len) {
					return -1;
				}
			}
			if(next[j]!=0) {
				j = next[j] - 1;
			}else {
				i++;
			}
		}
	}
}