
public class Hero {

	String name;      //フィールド宣言
	int atk;
	
	public void  attack(Matango m) {
		m.hp -= this.atk;
		System.out.println(this.name + "はマタンゴ" + m.suffix + "に" + this.atk + "のダメージをあたえた！");
		System.out.println( m.suffix + "の体力は残り" + m.hp);
	}
	
}
