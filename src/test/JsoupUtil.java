/** 
* @Title: JsoupUtil.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2022年5月25日 
* @version V1.0 
*/
package test;

import java.io.File;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * @Description:
 * @author zyx
 * @date 2022年5月25日 下午8:47:48
 */
public class JsoupUtil {

	/** 
	 * @Description:
	 * @Author zyx
	 * @date 2022年5月25日
	 */
	public static void main(String[] args) throws Exception{
		File f = new File("C:/Users/10628/Desktop/new6.html");
        if(f.exists()) {
            Document doc = Jsoup.parse(f,"utf-8");
            Elements es = doc.getElementsByTag("a");
            showHref(es);
        }
	}
	
	private static void showHref(Elements es) {
        for (Element e : es) {
            System.out.println(e.attr("title"));
        }
         
    }
	
	private static void showText(Elements es) {
        for (Element e : es) {
            System.out.println(e.text());
        }
         
    }

}
