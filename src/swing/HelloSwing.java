/** 
* @Title: HelloSwing.java 
* @Package swing 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2021年11月8日 
* @version V1.0 
*/
package swing;

import javax.swing.JFrame;

/**
 * @Description:
 * @author zyx
 * @date 2021年11月8日 下午2:48:41
 */
public class HelloSwing {

	public static void main(String[] args) {
	    JFrame frame = new JFrame("Hello Swing");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(300, 100);
	    frame.setVisible(true);
	  }
}
