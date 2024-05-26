package designPatterns.creational.prototype;

public class Client {

	public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman s1=new Swordsman();
		s1.move(new Point3D(-10,0,0),20);
		s1.attack();
		System.out.println(s1);
		Swordsman s2= (Swordsman) s1.clone();
		System.out.println(s2);

		General g1=new General();
		g1.move(new Point3D(-10,0,0),20);
		General g2= (General) g1.clone();//Clone not Supported exception
	}

}
