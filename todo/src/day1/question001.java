package day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class question001 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("input number?");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		Pattern patternInt = Pattern.compile("^-?[0-9]+$");
		Pattern patternDec = Pattern.compile("^-?[0-9]+\\.[0-9]+$");
		
		Matcher mInt = patternInt.matcher(str);
		Matcher mDec = patternDec.matcher(str);
		
		if (mInt.find() || mDec.find()) {
			BigDecimal num = new BigDecimal(str);
			System.out.println(num);
		} else {
			System.out.println("入力された値は数字ではありません");
		}
		
//		if (mInt.find()) {
//			int num = Integer.parseInt(str);
//			BigDecimal dcml = new BigDecimal(str);
//			System.out.println(dcml);
//		} else if (mDec.find()) {
//			double num = Double.parseDouble(str);
//			BigDecimal num = new BigDecimal(str);
//			System.out.println(num);
//		} else {
//			System.out.println("入力された値は数字ではありません");
//		}
	}
	


}
