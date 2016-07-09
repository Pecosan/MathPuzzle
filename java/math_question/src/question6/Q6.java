package question6;

public class Q6 {

	public static void main(String[] args) {
		int ans = 0;
		// 2~10,000の偶数を繰り返す
		for(int i=2; i<=10000; i=i+2) {
			int num = i * 3 + 1;
			
			// 1かiになるまで繰り返す
			while(num != i && num != 1) {
				switch(num%2) {
				case 0:
					num = num / 2;
					break;
				case 1:
					num = num * 3 + 1;
					break;
				}
			}
			if(num == i) {
				ans++;
			}
		}
		System.out.println("Answer:" + ans);
	}
}
