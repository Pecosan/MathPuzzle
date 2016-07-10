package first;

import java.util.Calendar;

public class Q7 {
	public static void main(String[] args) {
		// スタート時間
		long start = System.currentTimeMillis();
		
		//　処理
		// 開始日
		Calendar date = Calendar.getInstance();
		date.set(1964, 10, 10, 0, 0);
		//msまで比較されるから0を設定
		date.set(Calendar.MILLISECOND,0);
		
		// 終了日
		Calendar endDate = Calendar.getInstance();
		endDate.set(2020, 7, 27, 0, 0);
		//msまで比較されるから0を設定
		endDate.set(Calendar.MILLISECOND,0);
		
		while(date.compareTo(endDate) != 0) {
			Calendar ans = Q7.getSameDate(date);
			if(ans != null) {
				System.out.println(ans.get(Calendar.YEAR)
						+ "/" + (ans.get(Calendar.MONTH)+1)
						+ "/" + ans.get(Calendar.DATE));
			}
			
			// 1日追加
			date.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// 終了時間
		long end = System.currentTimeMillis();
		System.out.println("処理時間" + (end - start)  + "ms");
	}
	
	private static Calendar getSameDate(Calendar date) {
		String year = String.valueOf(date.get(Calendar.YEAR)) ;
		int intMonth = date.get(Calendar.MONTH) + 1;
		String month = intMonth<10 ? "0"+intMonth : String.valueOf(intMonth);
		int intDay = date.get(Calendar.DATE);
		String day = intDay<10 ? "0"+intDay : String.valueOf(intDay);
		String d = year + month + day;
		int intDate = Integer.parseInt(d);
		String twoNum = Integer.toBinaryString(intDate);
        StringBuffer sb = new StringBuffer(twoNum);
        String reverseNum = sb.reverse().toString();
        if(twoNum.equals(reverseNum)) {
        	return date;
        }
		
		return null;
	}
}
