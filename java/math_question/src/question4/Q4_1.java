package question4;

import java.util.ArrayList;
import java.util.List;

public class Q4_1 {

	public static void main(String[] args) {
		// 	セクションの数
		int section = 100;
		// 人の数
		int personNum = 5;
		
		int roop = 0;
		
		// 分割したセクションの数
		List<Integer> divide = new ArrayList<Integer>();
		divide.add(section);
		
		// 分割回数をループさせる
		for(int i=0; i<personNum; i++) {
			roop++;
			// 人数をループ
			for(int t=0; t<=i; t++) {
				int divideNum = Util.getDividingSection(divide, t);
				
				if(divideNum == -1) {
					System.out.println(roop);
				}else if(divide.get(divideNum) %2 == 1) {
					divide.set(divideNum, divide.get(divideNum)-1);
					divide.add(1);
				} else {
					int num = divide.get(divideNum)/2;
					divide.set(divideNum, num);
					divide.add(num);
				}
			}
		}
		
		while(true) {
			roop++;
			for(int t=0; t<=personNum; t++) {
				int divideNum = Util.getDividingSection(divide, t);
				
				if(divideNum == -1) {
					System.out.println(roop);
					break;
				}else if(divide.get(divideNum) %2 == 1) {
					divide.set(divideNum, divide.get(divideNum)-1);
					divide.add(1);
				} else {
					int num = divide.get(divideNum)/2;
					divide.set(divideNum, num);
					divide.add(num);
				}
			}
			
			if(Util.getDividingSection(divide, 0) == -1) {
				break;
			}
		}
	}
}
