package interfaces;

/**
 * Created by dabao on 2016/10/30.
 * 工厂方法设计模式
 * 理解:想出服务,然后建立工厂,提供这些服务
 * 使用:先建立工厂,然后使用服务(工厂创建服务)
 */
interface Service{
	void method1();
	void method2();
}

interface ServiceFactory{
	Service getService();
}

class Implementation1 implements Service{
	@Override
	public void method1() {
		System.out.println("Implementation1 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory{
	@Override
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service{
	@Override
	public void method1() {
		System.out.println("Implementation2 method1");
	}

	@Override
	public void method2() {
		System.out.println("Implementation2 method2");
	}
}

class Implementation2Factory implements ServiceFactory{
	@Override
	public Service getService() {
		return new Implementation2();
	}
}
public class Factories {
	public static void serviceConsumer(ServiceFactory fact){
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		serviceConsumer(new Implementation2Factory());
	}
}
