package c07;

/**
 * Created by dabao on 2016/10/25.
 */
class Game{
	Game(int i){
		System.out.println("Game begin:" + i);
	}
}

class BoardGame extends Game{
	BoardGame(int i)
	{
		//如果不是默认的够罩函数就必需使用super调用构造函数,在这个之前不能出现任何东西
		super(i);
		System.out.println("BoardGame begin:" + i);
	}
}
public class Chess extends BoardGame {
	Chess()
	{
		super(11);
		System.out.println("chess game begin");
}

	public static void main(String[] args){
		Chess x = new Chess();
	}
}
