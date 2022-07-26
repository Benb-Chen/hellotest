/** 
* @Title: ReflectDemo.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2022年7月17日 
* @version V1.0 
*/
package test;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Description:
 * @author zyx
 * @date 2022年7月17日 下午12:15:27
 */
public class ReflectDemo {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		Hero h = new Hero("英雄哥", 100, 10);
		Set set = new HashSet();
		list .add(h);
        try {
            // 获取这个名字叫做setName，参数类型是String的方法
            Method getMtd = list.getClass().getMethod("get", int.class);
            // 对h对象，调用这个方法
            Object item = getMtd.invoke(list, 0);
            // 使用传统的方式，调用getName方法
            System.out.println(item);
 
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}
}
