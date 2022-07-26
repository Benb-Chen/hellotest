package test;

public class BlackCatTest {
	Cat getBlackCat(){
		return new Cat(){
			String type = "黑猫";
			{
				type = "blackCat";
				if(type.equals("blackCat"))
					System.out.println("成啦！");
			};
			String jiaoHuan(){
				return type;
			}
		};
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BlackCatTest test = new BlackCatTest();
		Cat cat1 = test.getBlackCat();
		System.out.println(cat1.jiaoHuan());;
	}

}
