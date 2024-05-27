package designPatterns.creational.singelton.eager;

public class Client {

	public static void main(String[] args) {
	//	EagerRegistry eagerRegistry=new EagerRegistry(); beacuse the constructor is private
		EagerRegistry eagerRegistry=EagerRegistry.getInstance();
		EagerRegistry eagerRegistry2=EagerRegistry.getInstance();
		EagerRegistry eagerRegistry3=EagerRegistry.getInstance();
		System.out.println(eagerRegistry3==eagerRegistry2);
	}

}
