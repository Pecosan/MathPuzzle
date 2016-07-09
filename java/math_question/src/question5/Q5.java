package question5;

import java.util.HashMap;
import java.util.Map;

public class Q5 {
	static int ans = 0;
	static int inMoney = 1000;
	static int maxCount = 15;
	static int[] moneyList = {500, 100, 50, 10};
	static int nowMoney = 0;
	static int moneyNum = 0;
	
	public static void main(String[] args) {
		
		Q5.loopMoney();
		
		System.out.println(ans);
	}
	
	static void loopMoney() {
		if(moneyNum > moneyList.length) {
			return;
		}
		int money = moneyList[moneyNum];
		int maxCount = inMoney/money > 15 ? 15 : inMoney/money;
		for(int i=0; i<=maxCount; i++) {
			nowMoney += money * i;
			if(moneyNum != moneyList.length-1) {
				moneyNum++;
				Q5.loopMoney();
				if(i != 0) {
					nowMoney -= money * (i-1);
				}
			} else {
				if(nowMoney == inMoney) {
					ans++;
				} else {
					nowMoney -= money * i;
					if(i == maxCount) {
						moneyNum--;
						if(moneyNum != moneyList.length) {
							nowMoney -= moneyList[moneyNum-1];
						}
					}
				}
			}
		}
		
	}

}
