/** 
* @Title: LambdaDemo.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2022年7月19日 
* @version V1.0 
*/
package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @Description:
 * @author zyx
 * @date 2022年7月19日 上午11:02:35
 */
public class LambdaDemo {

	/** 
	 * @Description:
	 * @Author zyx
	 * @date 2022年7月19日
	 */
	public static void main(String[] args) {
		Map<String, String> data = new HashMap<>();
		Optional<String> first = data.keySet().stream().filter(s -> "".startsWith(s)).findFirst();
		System.out.println("SUCCESS");
    }
		 


}
