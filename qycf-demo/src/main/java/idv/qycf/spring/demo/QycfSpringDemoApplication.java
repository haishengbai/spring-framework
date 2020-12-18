package idv.qycf.spring.demo;

import idv.qycf.spring.demo.components.DemoComponent;
import idv.qycf.spring.demo.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author v_baihaisheng
 * @create 2020/12/18 4:28 下午
 */
public class QycfSpringDemoApplication {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext(DemoConfiguration.class);

		DemoComponent component = annotationConfigApplicationContext.getBean(DemoComponent.class);
		component.execute();

	}

}
