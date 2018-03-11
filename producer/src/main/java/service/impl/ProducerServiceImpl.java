package service.impl;

import service.IProducerService;

/**
 * Created by lenovo on 2018/3/5.
 */
public class ProducerServiceImpl implements IProducerService {
	/**
	 * @param
	 * @return java.lang.String
	 * @throws
	 * @Title: testDubbo
	 * @Description:
	 * @author qianhuahsneg
	 * @date 2018/03/05 04:18:35
	 */
	public String testDubbo() {
		System.out.print("RPC调用成功");
		return "";
	}
}
