package test;

/**
 * @Description:父类-动物类
 * @author zyx
 * @date 2020年8月30日 下午1:10:39
 */

public class Animal {

	String name = "animal";
	int age;
	char ch;
	int[] ageArray;
	boolean bool;
	
	public Animal() {
		name = "构造器";
		System.out.println("构造animal"+name);
	}

	 Object jiaoHuan(){
		System.out.println("动物说：我是一个 "+name);
		return "jiaohuan";
	}
	
	public Object name(Object input){
		return getClass().getSimpleName();
	}
	public static void main(String[] args) {
		Animal a = new Animal();
//		a.jiaoHuan();
//		System.out.println(a.name(new Object()));
	}
	{
		name = "块";
		System.out.println("块name"+name);
	}
	static {
		System.out.println("静态块");
	}
}
