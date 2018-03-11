import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.IProducerService;

/**
 * Created by lenovo on 2018/3/5.
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("consume.xml");
		applicationContext.start();
		IProducerService iProducerService = (IProducerService)applicationContext.getBean("producerService");
		iProducerService.testDubbo();
	}
}
