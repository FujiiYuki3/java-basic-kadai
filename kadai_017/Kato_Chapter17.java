package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName; //姓を表す
	public String givenName; //名を表す
	public String address; //住所を表す
	
	public void commonIntroduce() {
		familyName = "加藤";
		address = "東京都中野区○×";
	}
	
	public abstract void eachIntroduce();

	public void execIntroduce() {
		System.out.println("名前は" + familyName + givenName + "です");
		System.out.println("住所は" + address + "です");
	}

}
