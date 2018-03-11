import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by lenovo on 2018/3/5.
 */
public class App {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("provider.xml");
		applicationContext.start();
		System.out.println("服务启动");
		System.in.read();
	}
}
