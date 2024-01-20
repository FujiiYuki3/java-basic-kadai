package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {
	public String getMyChoice() {
		Scanner ownJyanken = new Scanner(System.in);
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input = ownJyanken.next();
			if((input.equals("r") || input.equals("s") || input.equals("p"))) {
				ownJyanken.close();
				return input;
			}else {
				System.out.println("もう一度入力しのしてください");
				continue;
			}
		}
	}
	
	public String getRandom() {
		String[] opponentJyanken = {"r", "s", "p"};
		int random = (int)Math.floor(Math.random()*3);
		return opponentJyanken[random];
	}
	
	public void playGame(String getMyChoice, String getRandom) {
		HashMap<String, String> hand = new HashMap<String, String>();
		hand.put("r", "グー");
		hand.put("s", "チョキ");
		hand.put("p", "パー");
		
		System.out.println("自分の手は" + hand.get(getMyChoice) + ",対戦相手の手は" + hand.get(getRandom));
		
		if((getMyChoice.equals("r")) && (getRandom.equals("r"))) {
			System.out.println("あいこです");
		}else if((getMyChoice.equals("r")) && (getRandom.equals("s"))) {
			System.out.println("自分の勝ちです");
		}else if((getMyChoice.equals("r")) && (getRandom.equals("p"))) {
			System.out.println("自分の負けです");
		}else if((getMyChoice.equals("s")) && (getRandom.equals("s"))) {
			System.out.println("あいこです");
		}else if((getMyChoice.equals("s")) && (getRandom.equals("p"))) {
			System.out.println("自分の勝ちです");
		}else if((getMyChoice.equals("s")) && (getRandom.equals("r"))) {
			System.out.println("自分の負けです");
		}else if((getMyChoice.equals("p")) && (getRandom.equals("p"))) {
			System.out.println("あいこです");
		}else if((getMyChoice.equals("p")) && (getRandom.equals("r"))) {
			System.out.println("自分の勝ちです");
		}else if((getMyChoice.equals("p")) && (getRandom.equals("s"))){
			System.out.println("自分の負けです");
		}
	}

}
