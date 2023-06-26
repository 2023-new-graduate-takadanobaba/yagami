package day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class question005_another {

	public static void main(String[] args)  throws IOException{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("名前を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String name = reader.readLine();
		System.out.println("こんにちは、" + name + "さん");
		System.out.println("好きな食べ物をすべて入力してください");
		
		List<String> favorite = new ArrayList<>();
		
		while (true) {
			String str = reader.readLine();
			favorite.add(str);
			if (str.equals("")) {
				break;
			}
		}
		
		String outputFav ="";

		for (int i = 0; i < favorite.size()-2; i++) {
			outputFav += favorite.get(i) + "と、";
			if (i == favorite.size()-3) {
				outputFav += favorite.get(i+1);
			}
		}
		
		if (favorite.size() == 1) {
			System.out.println("ありがとうございました");
		} else if (favorite.size() == 2) {
			System.out.println(name + "さんの好きな食べ物は" + favorite.get(0) +"ですね");
		} else {
			System.out.println(name + "さんの好きな食べ物は" + outputFav +"ですね");
		}
	}

}
