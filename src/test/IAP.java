/** 
* @Title: IAP.java 
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
 * @date 2022年3月11日 下午5:29:12
 */
public interface IAP {
	default void attack(){
		System.out.println("iap");
	};
}
