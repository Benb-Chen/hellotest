/** 
* @Title: ProbabilityCalculater.java 
* @Package test 
* @Description: TODO(用一句话描述该文件做什么) 
* @author 10628 
* @date 2021年9月6日 
* @version V1.0 
*/
package test;

/**
 * @Description:概率计算器
 * @author zyx
 * @date 2021年9月6日 下午5:26:03
 */
public class ProbabilityCalculater {

	/**
	 * 
	 * @Description:计算器
	 * @Author zyx
	 * @date 2021年9月6日
	 */
	private double ProbabilityCalculate(double m, double n, double k){
		return (1-(factorial(m-n)*factorial(m-k))/(factorial(m)*factorial(m-n-k)));
	}
	
	/**
	 * 
	 * @Description:计算器
	 * @Author zyx
	 * @date 2021年9月6日
	 */
	private double ProbabilityCalculateShuffle(double m, double n, double k){
		return 1-((factorial(m-n)*factorial(m-k))/(factorial(m)*factorial(m-n-k)))*((factorial(m-n)*factorial(m-k))/(factorial(m)*factorial(m-n-k)));
	}
	
	/**
	 * 
	 * @Description:阶乘函数
	 * @Author zyx
	 * @date 2021年9月6日
	 */
	private double factorial(double n) {
		if (n == 0) {
			return 1;
		} else {
			double num = n * factorial(n - 1);
			return num;
		}
	}

	public static void main(String[] args) {
		ProbabilityCalculater p = new ProbabilityCalculater();
		System.out.println(p.ProbabilityCalculateShuffle(30,1,3));
	}
}
