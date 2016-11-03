package polymorphism;

/**
 * Created by dabao on 2016/10/27.
 */
//import static com.oubl23.util.Print.*;
//class Shared{
//	private  int refcount = 0;
//	private static long counter = 0;
//	private final long id = counter++;
//	public Shared(){
//		print("CReating " + this);
//	}
//	public void addRef() { refcount++ ;}
//	protected void dispose(){
//		if(--refcount == 0){
//			print("Disposing " + this);
//		}
//	}
//
//	public String toString(){ return "Shared " + id ;}
//}
//
//class Composing{
//	private Shared shared;
//	private static long counter = 0;
//	private final long id = counter++;
//	public Composing(Shared shared){
//		print("creating " + this);
//		this.shared = shared;
//		this.shared.addRef();
//		//this.shared.addRef();
//	}
//	protected void dispose(){
//		print("disposubg " + this);
//		shared.dispose();
//		//shared.dispose();
//	}
//
//	public String toString(){
//		return "Composing " + id;
//	}
//}
//public class ReferenceCounting {
//	public static void main(String[] args){
//		Shared shared =new Shared();
//		Composing[] composing = {
//				new Composing(shared),
//				new Composing(shared),
//				new Composing(shared),
//		};
//
//		for(Composing com:composing)
//			com.dispose();
//	}
//
//}
