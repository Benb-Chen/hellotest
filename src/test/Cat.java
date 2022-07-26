package test;

import java.lang.reflect.Field;

/**
 * @Description:
 * @author zyx
 * @date 2020年6月24日 下午12:18:13
 */
public class Cat extends Animal {
	
	private static String name;
	int[] intArry = new int[10];
	String jiaoHuan(){
		System.out.println("猫说：我是一个 "+name);
		return name;
	}
	String miaomiao(){
		System.out.println("miaomiao");
		return "miaomiao";
	}
	/*{
		System.out.println("代码块");
		System.out.println(name); 
	}*/
	public Cat(){
		//super();
		System.out.println("构造cat");
		/*for (int i : intArry) {
			System.out.println(i);
		}
		System.out.println(intArry);*/
		/*System.out.println("默认构造器");
		System.out.println(name);*/
	}
	public Cat(String catName){
		/*System.out.println("构造器");
		System.out.println(catName);*/
		name = catName;
	}
	/*public String toString(){
		return name;
		
	}*/
	public static void main(String[] args) {
		Cat cat = new Cat();
	}
}
