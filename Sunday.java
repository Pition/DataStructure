public class Sunday{
	public static void main(String[] args) {
		String a = "believe";	//����
		String b = "lie";			//ģʽ��
		System.out.println(sundayMatch(a, b));	// -1��ʾ��ƥ�䣬������ʾģʽ���������е�һ�γ��ֵ�λ��
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