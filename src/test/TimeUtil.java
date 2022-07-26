/** 
* @Title: TimeUtil.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2022年5月26日 
* @version V1.0 
*/
package test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Description:
 * @author zyx
 * @date 2022年5月26日 上午12:14:36
 */
public class TimeUtil {

	/** 
	 * @Description:
	 * @Author zyx
	 * @date 2022年5月26日
	 */
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		for (int i = 0; i < 195; i++) {
			c.add(Calendar.SECOND, -1);
			Date time = c.getTime();
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String format = simpleDateFormat.format(time);
			System.out.println(format);
		}
	}

}
