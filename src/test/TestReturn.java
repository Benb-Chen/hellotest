package test;

public class TestReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(123);
		System.out.println(iWantAnAnimla().getClass());
		Animal animal = iWantAnAnimla();
		System.out.println(animal.getClass());
		System.out.println(animal.jiaoHuan());
		Cat cat = (Cat)animal;
		cat.miaomiao();
		System.out.println(cat.jiaoHuan());
		cat.jiaoHuan();
	}
	public static Animal iWantAnAnimla(){
		return new Cat();
	}
}
