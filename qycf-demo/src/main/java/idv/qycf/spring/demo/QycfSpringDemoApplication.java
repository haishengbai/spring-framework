package idv.qycf.spring.demo;

import idv.qycf.spring.demo.components.DemoComponent;
import idv.qycf.spring.demo.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @Author v_baihaisheng
 * @create 2020/12/18 4:28 下午
 */
public class QycfSpringDemoApplication {

	public static void main(String[] args) {

//		AnnotationConfigApplicationContext annotationConfigApplicationContext =
//				new AnnotationConfigApplicationContext(DemoConfiguration.class);
//
//		DemoComponent component = annotationConfigApplicationContext.getBean(DemoComponent.class);
//		component.execute();

		initAnnotationConfigApplicationContext();
	}


	public static void initClassPathXmlApplicationContext() {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
		DemoComponent demoComponent = classPathXmlApplicationContext.getBean(DemoComponent.class);
		demoComponent.execute();
	}

	public static void initAnnotationConfigApplicationContext() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("idv");
		DemoComponent demoComponent = annotationConfigApplicationContext.getBean(DemoComponent.class);
		demoComponent.execute();
	}

	public static void initFileSystemXmlApplicationContext() {
		FileSystemXmlApplicationContext fileSystemXmlApplicationContext = new FileSystemXmlApplicationContext("");

	}

	public static void initEmbeddedWebApplicationContext() {
		// spring boot
//		new EmbeddedWebApplicationContext();
	}



}
