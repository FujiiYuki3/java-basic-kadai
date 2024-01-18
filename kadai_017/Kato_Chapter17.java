package kadai_017;

public abstract class Kato_Chapter17 {
	public String familyName = "加藤"; //姓を表す
	public String givenName = ""; //名を表す
	public String address = "東京都中野区○×"; //住所を表す
	
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
	}
	
	public abstract void eachIntroduce();

	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}

}
