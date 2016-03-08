package facade;

public class Facade {

	SubSystemOne one;

	SubSystemTwo two;

	SubSystemThree three;

	public Facade() {
		one = new SubSystemOne();
		two = new SubSystemTwo();
		three = new SubSystemThree();
	}

	public void methodeA() {

		System.out.println(" methode A () ");
		one.methodOne();
		three.methodThree();
	}

	public void methodeB() {
		System.out.println("methode B() ");
		two.methodTwo();
		three.methodThree();
	}
}
