/** 
* @Title: ADHero.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2022年3月11日 
* @version V1.0 
*/
package test;

/**
 * @Description:
 * @author zyx
 * @date 2022年3月11日 下午5:18:44
 */
public class ADHero extends Hero1 {

	/* @Override
	    public void physicAttack() {
	        System.out.println("进行物理攻击");
	    }*/
	     
	    //隐藏父类的battleWin方法
	    public static void battleWin(){
	        System.out.println("ad hero battle win");
	    }   
	     
	    public static void main(String[] args) {
	        Hero1.battleWin();
	        ADHero.battleWin();
	    }

}
