package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class question006 {


	public static void main(String[] args) throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力してください");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		
		System.out.println(name);
		
		String[] strArray = name.split("");
		for (String s : strArray) {
			System.out.println(s);
		}
		

		for (int i = strArray.length; i > 0; i--) {
			// 入力後に改行する
			if (i == 1) {
				System.out.println(strArray[i-1]);
			} else {
				System.out.print(strArray[i-1]);
			}
		}
		
		
		for (int i = strArray.length; i > 0; i--) {
			System.out.println(strArray[i-1]);
		}
		
		
	}

}
