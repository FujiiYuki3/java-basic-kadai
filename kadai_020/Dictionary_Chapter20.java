package kadai_020;

import java.util.HashMap;

public class Dictionary_Chapter20 {
	public void searchArray(String[] words) {
		HashMap<String, String> dictionaryList = new HashMap<String, String>();
	
		dictionaryList.put("apple", "りんご");
		dictionaryList.put("peach", "桃");
		dictionaryList.put("banana", "バナナ");
		dictionaryList.put("lemon", "レモン");
		dictionaryList.put("pear", "梨");
		dictionaryList.put("kiwi", "キウィ");
		dictionaryList.put("strawberry", "いちご");
		dictionaryList.put("grape", "ぶどう");
		dictionaryList.put("muscat", "マスカット");
		dictionaryList.put("cherry", "さくらんぼ");
		
		for (int i = 0; i < words.length; i++) {
			if(dictionaryList.containsKey(words[i])) {
				System.out.println(dictionaryList.get(words[i]));
			}else {
				System.out.println("辞書に登録されておりません");
			}
		}
	}
}
