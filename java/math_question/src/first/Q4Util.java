package first;

import java.util.List;

public class Q4Util {

	static int getDividingSection(List<Integer> divide, int person) {
		
		for(int i=person; i<divide.size(); i++) {
			switch(divide.get(i)) {
			case 1:
				continue;
			default:
				return i;
			}
		}
		return -1;
	}
}
