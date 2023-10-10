package kadai_020;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		lookup("apple");
		lookup("banana");
		lookup("grape");
		lookup("orange");
		
	}

	private static void lookup(String text) {
HashMap<String,String> dictionary = new HashMap<String,String>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		

		if(dictionary.get(text) == null) {
			System.out.println(text + "は辞書に存在しません。");
		}else {
		System.out.println(text + "の意味は" + dictionary.get(text) + "です");
		}
		// TODO 自動生成されたメソッド・スタブ
		
	}
	

}
