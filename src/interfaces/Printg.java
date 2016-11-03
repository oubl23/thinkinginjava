package interfaces;

import com.oubl23.util.PrintDabao;

/**
 * Created by dabao on 2016/10/29.
 */
public class Printg implements PrintDabao {
	@Override
	public void printDabao() {
		System.out.println("dabao");
	}

	@Override
	public void printOubl23() {

		System.out.println("oubl23");
	}

	@Override
	public void printXiaobao() {

		System.out.println("xiaobao");
	}

	public static void main(String[] args){
		PrintDabao p = new Printg();
		p.printDabao();
		p.printOubl23();
		p.printXiaobao();
	}
}
