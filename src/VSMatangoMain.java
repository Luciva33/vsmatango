
public class VSMatangoMain {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Hero hero = new Hero();
		hero.name = "エクス";
		hero.atk = 20;
		
		
		Matango m1 = new Matango();
		m1.suffix = 'A';
		m1.hp = 100;
		
		Matango m2 = new Matango();
		m2.suffix = 'B';
		m2.hp = 100;
		
		hero.attack(m1);
		m1.run();
		m2.run();
		
	}

}
