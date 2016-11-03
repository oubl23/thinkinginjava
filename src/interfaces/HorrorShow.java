package interfaces;

/**
 * Created by dabao on 2016/10/29.
 */
interface Monster{
	void menace();
}
interface DanerousMonster extends Monster{
	void destroy();
}

interface Lethal{
	void kill();
}

class DragonZilla implements DanerousMonster{
	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}
}

interface Vampire extends DanerousMonster, Lethal{
	void dirnkBlood();
}

class VeryBadVampire implements Vampire{
	@Override
	public void menace() {

	}

	@Override
	public void destroy() {

	}

	@Override
	public void kill() {

	}

	@Override
	public void dirnkBlood() {

	}
}
public class HorrorShow {
	static void u(Monster b){
		b.menace();
	}
	static void v(DanerousMonster d){
		d.menace();
		d.destroy();
	}

	static void w(Lethal l){
		l.kill();
	}

	public	static void main(String[] args){
		DanerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}
