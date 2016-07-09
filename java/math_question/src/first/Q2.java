package first;

public class Q2 {
	
	public static void main(String[] args) {
		String[] operation = {":", ""};
		for(int num=1000; num<10000; num++) {
			String numString = String.valueOf(num);
			String[] numArray = numString.split("",0);
			StringBuffer sb = new StringBuffer(numString);
			String reverse = sb.reverse().toString();
			
			if(numString.equals(reverse)) {
				continue;
			}
			
			for(int f=0; f<operation.length; f++) {
				for(int s=0; s<operation.length; s++) {
					for(int t=0; t<operation.length; t++) {
						String siki = numArray[0] + operation[f] + numArray[1] + operation[s] + numArray[2] + operation[t] + numArray[3];
						String[] kou = siki.split(":",0);
						int ansNum = 1;
						for(int i=0; i<kou.length; i++) {
							ansNum = ansNum * Integer.parseInt(kou[i]);
						}
						
						if(reverse.equals(String.valueOf(ansNum))) {
							System.out.println(num + ":" + siki + ":");
						}
					}
				}
			}
		}
	}

}
