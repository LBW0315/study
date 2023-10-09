package kadai_020;

import java.util.HashMap;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
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
		
		
		System.out.println(dictionary.get("apple"));
		System.out.println(dictionary.get("banana"));
		System.out.println(dictionary.get("grape"));
		System.out.println(dictionary.get("orange"));
		
	}
	

}
