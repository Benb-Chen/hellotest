/** 
* @Title: Hero1.java 
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
 * @date 2022年3月11日 下午5:17:59
 */
public class Hero1 implements IAD,IAP{
	 public String name;
	    protected float hp;
	  
	    //类方法，静态方法
	    //通过类就可以直接调用
	    public static void battleWin(){
	        System.out.println("hero battle win");
	    }
	public Hero1() {
		// TODO Auto-generated constructor stub
	}
	/**
	* <p>Title: attack</p> 
	* <p>Description: </p> 
	* @return 
	* @see test.IAD#attack() 
	*/
	/**
	* <p>Title: attack</p> 
	* <p>Description: </p>  
	* @see test.IAD#attack() 
	*/ 
	@Override
	public void attack() {
		// TODO Auto-generated method stub
		IAD.super.attack();
	} 

}
