package interfaces.interfaceprocessor;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by dabao on 2016/10/30.
 */
class GenterChar{
	private Random rand = new Random(47);
	private char[] capotal= "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	public char[] generate(){
		char[] buffer = new char[11];
		int id = 0;
		for (int i = 0; i < 5; i++) {
			buffer[2*i] = capotal[rand.nextInt(capotal.length)];
			buffer[2*i + 1] = lowers[rand.nextInt(lowers.length)];
		}
		buffer[10]= ' ';
		return buffer;
	}
}
public class E16 extends GenterChar implements Readable {
	private int count;

	public E16(int count) {
		this.count = count;
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		if(count-- == 0)
			return -1;
		char [] buffer = generate();
		cb.put(buffer);
		return buffer.length;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(new E16(8));
		while(s.hasNext())
			System.out.println(s.next());
	}
}
