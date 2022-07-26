package test;

public class InnerClassTest {

	private String name;
	public InnerClassTest(String name){
		this.name = name;
		System.out.println("outter构造成功了,名字叫做"+name);
	}
	class InnerClass {
		InnerClass(){
			System.out.println("我构造成功了！你看到了吗"+name);
		}
	}
	public static void main(String[] args) {
		InnerClassTest ict = new InnerClassTest("xiaom");
		InnerClass ic = ict.new InnerClass();
	}

}
