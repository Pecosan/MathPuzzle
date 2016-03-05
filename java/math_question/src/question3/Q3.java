package question3;

import java.util.HashMap;
import java.util.Map;

public class Q3 {
	public static void main (String[] args) {
		Map<Integer,Boolean> cardMap = new HashMap<Integer,Boolean>();
		
		// カードの初期化
		for(int i=1; i<=100; i++) {
			cardMap.put(i, false);
		}
		
		for(int cardNum=2; cardNum<=100; cardNum++) {
			for(int p=1; p<=50; p++) {
				int changeCardNum = cardNum * p;
				if(changeCardNum > 100) {
					break;
				}
				
				Boolean cardInfo = changeCard(cardMap.get(changeCardNum));
				cardMap.put(changeCardNum, cardInfo);
			}
		}
		
		printBackCard(cardMap);
		
	}
	
	/**
	 * カードを裏返す
	 * @param card
	 * @return
	 */
	static Boolean changeCard(Boolean card) {
		if(card) {
			return false;
		} else {
			return true;
		}
	}
	
	static void printBackCard(Map<Integer,Boolean> cards) {
		for(int i=1; i<=100; i++) {
			if(!cards.get(i)) {
				System.out.println(i);
			}
		}
	}

}
