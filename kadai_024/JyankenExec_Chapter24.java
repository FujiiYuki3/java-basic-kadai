package kadai_024;

public class JyankenExec_Chapter24 extends Jyanken_Chapter24 {

	public static void main(String[] args) {
		Jyanken_Chapter24 jyanken = new Jyanken_Chapter24();
		
		String getMyChoice = jyanken.getMyChoice();
		String getRandom = jyanken.getRandom();
		jyanken.playGame(getMyChoice, getRandom);

	}

}