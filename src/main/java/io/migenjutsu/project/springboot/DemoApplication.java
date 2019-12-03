package io.migenjutsu.project.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import io.migenjutsu.project.dependencyinjection.controllers.NameController;

@SpringBootApplication
@ComponentScan("io.migenjutsu")
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

		NameController controller = (NameController) ctx.getBean("nameController");
		System.out.println(controller.sayName());
	}
}

	// 	ApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);

	// 	NameController controller = (NameController) ctx.getBean("nameController");
	// 	controller.sayName();
	// }
